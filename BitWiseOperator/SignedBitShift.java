public class SignedBitShift{

	public static void main(String[] args){
	
		byte b = (byte) -1;
		byte b1 = (byte)(b >> 1);
		byte b2 = (byte)(b1 >> 1);
		byte b3 = (byte)(b2 >> 1);
		byte b4 = (byte)(b3 >> 1);
		byte b5 = (byte)(b4 >> 1);
		byte b6 = (byte)(b5 >> 1);
		byte b7 = (byte)(b6 >> 1);

		System.out.println(String.valueOf(b7));
	}


}
