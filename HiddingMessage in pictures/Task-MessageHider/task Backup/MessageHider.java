import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public class MessageHider{

  public static void hideMessage(String inputFilename,String outputFilename,byte[] messageAsBytes){
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(inputFilename)))
        {
 
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null)
            {
                contentBuilder.append(sCurrentLine).append(" ");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
       	String s =  contentBuilder.toString();

	String[] stringArray = s.split(" ");

	byte[] lastBitsInArr = new byte[16];

	//extract bits from message
	int k = 0;
	int l = 7;
	int x = -1;
	while(k < messageAsBytes.length){
		int cur = messageAsBytes[k];
		while(l > x){
			lastBitsInArr[l]= (byte)(cur & (byte)01);
			cur = cur >> 1;
			l--;
		}
		l += 16;
		k++;
		x += 8;
	}
	
	int redIndex = 4;
	for(int i =0; i < lastBitsInArr.length; i++){
		if (lastBitsInArr[i] == 0){
			String rs = stringArray[redIndex];
			int[] intArr = {(byte)(rs.charAt(0)), (byte)(rs.charAt(1)), (byte)(rs.charAt(2))};
			intArr[2] =(byte)(intArr[2] & (byte)(11111110));
	        	String newString = new String(intArr,0,2);
			stringArray[redIndex] = newString + String.valueOf(intArr[2]);	
		} 
		redIndex += 3;
	}// end of for loop
	

	//String array to String
	String string = stringArray[0];
	for (int i =1; i < stringArray.length; i++){
		string = string + " " + stringArray[i];
	
	}
	// write to file
	FileOutputStream fs = null;
	try{
		fs = new FileOutputStream(outputFilename);
		fs.write(string.toString().getBytes("UTF-8"));
		fs.close();
	} catch (IOException ex){
		System.out.println(ex.getMessage());
	}


    }// messageHider end

}// class
