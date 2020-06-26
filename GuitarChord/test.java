import java.util.*;

public class test{
public static void main(String[] args){

		Integer i = new Integer(1); // construct an integer.
		// Integer is like int, but it is a class and as such has a constructor.
		// All objects ( classes ) have constructors.
		byte b = i.byteValue();
		System.out.println("The byte value of i is " + String.valueOf(b));

		float f = i.floatValue();
		System.out.println("The float value of i is " + String.valueOf(f));
		String[] arr1 = {"a", "b", "c", "d", "a", "d"};
		String[] arr2 = {"a", "b", "c", "d"};
		System.out.println(Arrays.hashCode(arr1));
		System.out.println(Arrays.hashCode(arr2));

}}
