import java.io.*;
public class Main{
	public static void main(String[] args){
		String fileName = args[0];
		String fileNameOut = args[1];
		try{
			int[][] imageArr = MessageHider.imageTo2DArr(fileName);
			byte[] messageBytes = args[1].getBytes("UTF-16");
			System.out.println("Attempting to hide bytes: ");
			for( byte b : messageBytes ){
				System.out.print(String.format("%02X ", b));
			}
			System.out.println("\nHidden bytes are:");
			MessageHider.HideBytes(messageBytes, imageArr);
			MessageHider.writeImage(imageArr);
			int[][] newImageArr = MessageHider.imageTo2DArr(fileNameOut);
			MessageHider.extractMessage(newImageArr, messageBytes.length);
		}
		catch(NoAlphaChannelException ex){
			System.err.println("File doesn't have an alpha channel: " + fileName);
		}
		catch(IOException ex){
			System.err.println("Error opening file " + fileName);
		}
	}
}
