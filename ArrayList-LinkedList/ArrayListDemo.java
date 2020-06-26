import java.util.*;

public class ArrayListDemo{
	public static void main(String[] args){
		List<Integer> intArrayList = new LinkedList<Integer>();
		intArrayList.add(1);
		intArrayList.add(100);
		for( int i : intArrayList ){
			System.out.println(i);
		}

		List<MyClass> classList = new LinkedList<MyClass>();
		classList.add( new MyClass() );
		classList.add( new MyClass() );
		classList.add( new MyClass() );

		for( MyClass mc : classList ){
			System.out.println( mc.x );
		}
	}
}

class MyClass{
	public int x = 1;
}
