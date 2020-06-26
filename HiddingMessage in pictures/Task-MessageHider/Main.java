import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.IOException;
import java.io.File;
import java.io.*;
import javax.imageio.ImageIO;

public class Main{

		    public static int[][] imageTo2DArr() throws IOException {
		    BufferedImage image = ImageIO.read(MessageHider.class.getResource("Red.ppm"));									  final byte[] pixels = ((DataBufferByte) image.getRaster().getDataBuffer()).getData();
		    final int width = image.getWidth();
		    final int height = image.getHeight();
		    int[][] result = new int[height][width];
		    final int pixelLength = 3;		
		    for (int pixel = 0, row = 0, col = 0; pixel + 2 < pixels.length; pixel += pixelLength) {
		            int rgb = 0; // rgb = Red, Green, Blue
		            int blue = (((int) pixels[pixel + 2] & 0xff) << 16);
		            int green = (((int) pixels[pixel + 1] & 0xff) << 8);
		            int red = ((int) pixels[pixel+0] & 0xff );
	                       rgb += blue;
	                       rgb += green;
	                       rgb += red;
	                        result[row][col] = rgb;
	                        col++;
	                        if (col == width) {
	                             col = 0;
	                             row++;
		                        }
	            }
		    return result;
		    }
		   
		public static void main(String[] args){
		int[][] Arr = null;	
		try { Arr = imageTo2DArr();
		 // Loop through all rows 
       		 for (int i = 0; i < Arr.length; i++) 
  	            // Loop through all elements of current row 
        	 for (int j = 0; j < Arr[i].length; j++) 
	     	System.out.print(Arr[i][j] + " "); 
		}
		catch (IOException ex){
		System.out.println("invalid input");
	}
}}
