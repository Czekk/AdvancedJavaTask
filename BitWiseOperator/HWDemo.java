public clss HWDemo{
	
	public static byte[] longToByteArray(long l){
		byte[] result = new byte[8];
		for(int b = 7; b >= 0; b--){
		
			result[b] = (byte)(l & 0xFF);
			l >>= 8;
		}
		return result;	
	}


	public static byte fukyFunction(byte[] bArr) throws InvalisArrLengthException{
		if(bArr.length != 8){
			throw new InvalidArrLengthEException("invalid array length");
		}
	
	
	
	
	}
	public static void main(String[] arg){
		long l = -1;
		byte[] bArr = longToByteArray(l);
		byte b = funkyfunction(bArr);
		System,out.orintln(String.valueOf(b));
	
	
	
	}









}
