public class Problem2{

public static void main(String[] args){
	String myString = "Hello World!";
	char l = 'l';
	char o = 'o';	
	int intL = l;
	int intO = o;
	int[] intArr = {0x0bc6, 0x0bae, 0x0020, 0x0bb2, 0x0bcd, 0x0020, 0x0bb5, 0x0bbf, 0x0020, 0x0ba9, 0x0bcd, 0x0020, 0x0020, 0x0b9f, 0x0bcd, 0x0020, 0x0bc7, 0x0bb0, 0x0020, 0x0b95, 0x0bcd, 0x0020};
	String melvynDrag = new String(intArr,0,21);
	System.out.println("The last index of character 'l' in string myString is : " + myString.lastIndexOf(intL));
	System.out.println("The first index of character 'o' from index 6(W) is : " + myString.indexOf(intO, 6));
	System.out.println("Melvyn Drag in tamil fonts is : " + melvynDrag);

}







}
