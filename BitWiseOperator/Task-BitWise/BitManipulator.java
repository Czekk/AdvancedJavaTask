public class BitManipulator{

    private static byte[] intToByteArray(int num){
	byte[] shortSizeArr = new byte[2];
        for (int i = 1; i >= 0; i--){
	    byte a = (byte)(num & 0x0F);
	    num >>= 8;
	    byte b =(byte)(num & 0x0F);
	    b <<= 4;
	    num >>= 8;
	    shortSizeArr[i] = (byte)(a | b);
	}
	return shortSizeArr;
    }

    private static short extractShort(byte[] byteArray) throws ByteArrayLengthException {
        if( byteArray.length != 2 ){
            throw new ByteArrayLengthException("parameter byteArray to 'extractShort' must have length 2.");
        }
        else{
	    short shortNum = 0;
	    for (int i = 0; i < 2; i++){
	      shortNum <<=8;
	      shortNum |= (byteArray[i] & 0xFF);
	    }
	    return shortNum;
        }
    }

    public static void main(String[] args){
        int i = 15302;
        byte[] byteArr = intToByteArray(i);
        try{
            short s = extractShort(byteArr);
                        System.out.println(String.valueOf(s));                                                       

	 }
        catch( Exception e ){
            System.out.println(e.getMessage());
        }
    }

}

class ByteArrayLengthException extends Exception{
    public ByteArrayLengthException( String s ){
        super(s);
    }
}

