import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.*;
import java.nio.charset.Charset;
import java.util.*;

public class test{
	
	public static void main(String[] args){
	
	String a = "Hi";
	byte[] bArr= a.getBytes();
	byte[] bitsInArr = new byte[16];
	int k = 0;
	int l = 7;
	int x = -1;
	while(k < bArr.length){
		int cur= bArr[k];
		while(l > x){
			bitsInArr[l]= (byte)(cur & (byte)01);
			cur = cur >> 1;
			l--;
		}
		l += 16;
		k++;
		x +=8;
	}
	
	System.out.println(Arrays.toString(bitsInArr));
	}
}
