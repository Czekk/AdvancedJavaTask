import java.util.Scanner;
import java.io.*;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.nio.charset.Charset;
public class Problem1{
	public static void main(String[] args){
	
	File utf8 = new File("utf8.txt");
	File utf16 = new File("utf16.txt");
	Scanner sc = null;
	FileOutputStream fs = null;
	try{
		sc = new Scanner(utf8, "UTF-8");
		String content;
		content = sc.next();
		sc.close();

			
	try{	
		fs = new FileOutputStream(utf16);
		fs.write(content.toString().getBytes("UTF-16"));
		
		fs.close();
	} catch ( IOException ex ){
		System.out.println(ex.getMessage());
		return;
	}

		
		
	} catch ( FileNotFoundException ex ){
		System.out.println(ex.getMessage());
		return;
	}
	
	}
}
