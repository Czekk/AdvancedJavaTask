import java.nio.charset.Charset;

public class UXXXX{
	public static void printBytes(byte[] byteArr){
		for ( byte b : byteArr ){
			System.out.print(String.format("%02X ", b));
		}
		System.out.println("");
	}
	
	public static void printSeparator(){
		System.out.println("************************************");
	}
	public static void main(String[] args){
		String Zero = "\u0030";
		printSeparator();
		System.out.println(Zero);
		byte[] zeroBytes = Zero.getBytes(Charset.forName("UTF-16"));
		printBytes(zeroBytes);

		printSeparator();
		String SymbolIDontRecognize = "\u0080";
		byte[] symbolBytes = SymbolIDontRecognize.getBytes(Charset.forName("UTF-16"));
		System.out.println("\u0080");
		printBytes(symbolBytes);
		// Note that \u0080 should be a "€".
		// But when we print this in the terminal on my computer we don't see that character.
		// Look here:
		// https://www.utf8-chartable.de/unicode-utf8-table.pl
		// This is because my computer prints out Strings in utf-8. 
		// As shown in the link above, the utf-8 encoding for \u0080 is \xc2\x80
		// but the font package I have installed on my computer does not print that value
		// So we just see a 'missingno' like in pokemon.
	}
}

