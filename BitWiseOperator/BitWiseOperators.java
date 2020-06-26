public class BitWiseOperators{

	public static void testAnd(){
		byte b = (byte)127;
		byte c = (byte)7;
		byte and = (byte)(b&c);
		System.out.println(String.valueOf(and));

	}
		public static void testOr(){
		byte b = (byte)127;
		byte c = (byte)7;
		byte or = (byte)(b|c);
		System.out.println(String.valueOf(or));

	}
		public static void testXOr(){
		byte b = (byte)127;
		byte c = (byte)7;
		byte Xor = (byte)(b^c);
		System.out.println(String.valueOf(Xor));

	}
	


	public static void main(String[] args){
	
		testAnd();
		testOr();
		testXOr();
	}







}
