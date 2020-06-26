import java.io.*;
import java.nio.charset.Charset;
import java.util.*;
public class test2{

public static void main(String[] args){
	String x = extractMessage("jlRed.ppm");
	System.out.println(x);
}

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
          for (int i=4; i < stringArray.length; i+=3){
		  if(Integer.valueOf(stringArray[i])==255){
                        hx = (hx<<1);
                        hx = (hx|(byte)01);
                }
                else {
                        hx = hx<<1;
                }
                if ((i==25) || (i==49)){
                        hxArr[j] = hx;
                        hx = 0;
                        j++;
                }
          }// for loop
        String outputString = new String(hxArr,0,2);
        return outputString;
  }//extractMessage end


}
