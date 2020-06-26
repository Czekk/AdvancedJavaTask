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
	

	
	String string = stringArray[0];
	for (int i =1; i < stringArray.length; i++){
		string = string + " " + stringArray[i];
	
	}
	


	FileOutputStream fs = null;
	try{
		fs = new FileOutputStream(outputFilename);
		fs.write(string.toString().getBytes("UTF-8"));
		fs.close();
	} catch (IOException ex){
		System.out.println(ex.getMessage());
	}


    }// messageHider end


  public static String extractMessage(String outputFilename){
	  StringBuilder contentBuilder = new StringBuilder();
	  try(BufferedReader br = new BufferedReader(new FileReader(outputFilename)))
	  {
	  	String sCurrentLine;
		while((sCurrentLine = br.readLine()) != null)
		{
			contentBuilder.append(sCurrentLine).append(" ");
		}
	  
	  }
	  catch (IOException e)
	  {
	  	e.printStackTrace();
	  }
	  String s = contentBuilder.toString();
	  String[] stringArray = s.split(" ");
	
	  int[] hxArr = new int[2];
	  int hx = 0;
	  int j = 0;
	  for (int i = 4; i < stringArray.length; i+=3){
	  	if(Integer.valueOf(stringArray[i]) == 255){
			hx = hx << 1;
			hx = hx | (byte)1;
		}
		else {
			hx = hx << 1;
		}
		if (i == 25 || i == 49){
			hxArr[j] = hx;
			hx = 0;
			j++;
		}
	  }// for loop
	String outputString = new String(hxArr,0,2);
	return outputString;
  }//extractMessage end
}// class
