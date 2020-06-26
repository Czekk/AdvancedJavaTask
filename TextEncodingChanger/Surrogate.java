public class Surrogate{
	public static void main(String[] args){
		char[] surrogatePair = {'\ud834', '\udd1e'}; // Pair of UTF-16 encoded characters.
		// Note, if you want, that neither \uD834 nor \uDD1E are valid characters by themselves.
		String s = new String(surrogatePair, 0, 2);
		System.out.println(s);

		// another way to do this. 
		// In Java, you can create Strings from the decimal representation of
		// the Unicode code point.
		// The treble clef is Unicode code point U+1D11E. Do not confuse this with the hex representation in UTF16 
		// the UTF 16 representation is the one above. The Unicode code point is the representation of the code point
		// in ANY UTF-scheme.
		int trebleClefInt = 0x1D11E;
		String s2 = new String(new int[]{trebleClefInt, trebleClefInt}, 0, 2);
		System.out.println(s2);
	}
}
