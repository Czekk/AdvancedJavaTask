public class Exam{
	public static byte[] stringToBytes(String message){
		String s = message;
		byte [] stringToByteArr = s.getBytes();
		return stringToByteArr;
	}
	public static void main(String[] args){
		final String inputFilename = args[0];
		final String outputFilename = args[1];
		final String message = args[2];
		final byte[] messageAsBytes = stringToBytes(message);
		if (messageAsBytes.length !=2){
			System.err.printf("You cannot hide the string %s with this code as it doesn't satisfy the string length required", message);
		}
		MessageHider.hideMessage(inputFilename, outputFilename, messageAsBytes);
		final String extractedMessage = MessageHider.extractMessage(outputFilename);
		System.out.println(String.format("Found message '%s' in %s", extractedMessage, outputFilename));	
	}





}
