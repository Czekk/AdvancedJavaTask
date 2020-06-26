import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public class ReadFileToString
{

    public static void main(String[] args)
    {
        String filePath = "Red.ppm";
 
        System.out.println( imageToString( filePath ) );
   writeToImage(imageToString( filePath ));
    }
  


  private static String hideMessage(String inputFilename,String outputFilename,byte[] messageAsBytes){
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
      	
	/*
	int[] intArray = new int[stringArray.length];
      	for (int i = 1; i < stringArray.length; i++) {
         	String numberAsString = stringArray[i];
         	intArray[i] = Integer.parseInt(numberAsString);
      	}*/

	byte[] lastBitsInArr = new byte[16];
	int k = 0;
	int l = 7;
	int x = -1;
	while(k < messageAsBytes.length){
		int cur = messageAsBytes[k];
		while(l > x){
			lastBitsInArr[l]= (byte)(cur & (byte)01);
			cur = cur >> 1;
			l--
		}
		l += 16;
		k++;
		x += 8;
	}
	
	int redIndex = 4;
	for(int i =0; i < lastBitsInArr.length; i++){
		if(lastBitsInArr[i] == 0){
		stringArray[redIndex] = (byte)(Integer.parseInt(stringArray[redIndex]) & (byte)11111110) 
		} 
	}

    }// messageHider end





  private static void writeToImage(String string) {
  
	FileOutputStream fs = null;
	try{
		fs = new FileOutputStream("newRed.ppm");
		fs.write(string.toString().getBytes("UTF-8"));

		fs.close();
	} catch ( IOException ex ){
		System.out.println(ex.getMessage());
		return;
	}
  }

}
