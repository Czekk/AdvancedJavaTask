import java.util.List;
import java.util.ArrayList;
import java.util.concurrent.*;

public class SynchronizedFactorial implements Runnable{

	public static long total = 1;
	
	private List<Integer> _myInts = null;

	SynchronizedFactorial( List<Integer> ints ){
		_myInts = ints;
	}

	private synchronized static void updateTotal( long partialFactorial ){
		total *= partialFactorial;
	}

	public void run(){
		long partialFactorial = 1;	
		for(Integer i : _myInts ){
			partialFactorial *= i;
		}
		updateTotal(partialFactorial);
	}

	public static void main(String[] args){
		List<Integer> intList = new ArrayList<Integer>();
		final int N = Integer.parseInt(args[0]);
		for(int i=0; i < N+1; ++i){
			intList.add(i);
		}
		List<Integer> intList1 = intList.subList(1, N/4); // upperBound is Exclusive
		List<Integer> intList2 = intList.subList(N/4, N/2); // lowerBound is inclusive
		List<Integer> intList3 = intList.subList(N/2, 3*N/4); // lowerBound is inclusive
		List<Integer> intList4 = intList.subList(3*N/4, N+1); // lowerBound is inclusive
		final long T0 = System.nanoTime();
		Thread t1 = new Thread(new SynchronizedFactorial(intList1));
		Thread t2 = new Thread(new SynchronizedFactorial(intList2));
		Thread t3 = new Thread(new SynchronizedFactorial(intList3));
		Thread t4 = new Thread(new SynchronizedFactorial(intList4));
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		try{
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		}
	
		catch( Exception ex ){
			System.err.println(ex.toString());
		}
		final long TF = System.nanoTime();
		System.out.println(String.format(
			"The factorial of the integers in [%d, %d) is %d.",
			1, N, SynchronizedFactorial.total )
		);
		System.out.println(String.format(
			"The factorial took %d nanoseconds to compute.",
			TF - T0)
		);
	}
}

