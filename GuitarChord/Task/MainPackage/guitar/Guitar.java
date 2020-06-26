package guitar;

import java.util.*;

public class Guitar{

	private static Guitar newGuitar = null;
	private static ArrayList<GuitarString> guitarS = new ArrayList<GuitarString>();

	private Guitar(){
		guitarS.add(new GuitarString("E"));	
		guitarS.add(new GuitarString("A"));
		guitarS.add(new GuitarString("D"));
		guitarS.add(new GuitarString("G"));
		guitarS.add(new GuitarString("B"));
		guitarS.add(new GuitarString("E"));

	}
	public static Guitar getInstance(){
		if (newGuitar == null){
			newGuitar = new Guitar();		
		}
		return newGuitar;
	}
	
	public String CMajShape(int barreLocation){
		String strANote = newGuitar.guitarS.get(1).getFrettedNote(barreLocation + 3);
		String strDNote = newGuitar.guitarS.get(2).getFrettedNote(barreLocation + 2);
		String strGNote = newGuitar.guitarS.get(3).getFrettedNote(barreLocation);
		String strBNote = newGuitar.guitarS.get(4).getFrettedNote(barreLocation + 1);
		String strENote = newGuitar.guitarS.get(5).getFrettedNote(barreLocation);
		String[] noteArr = {strANote, strDNote, strGNote};

		String chord = identifyChord(noteArr);
		String outPut = String.valueOf(barreLocation) + "; " + strANote + "," + strDNote  + "," + strBNote + "; " + chord;
		return outPut;
	}


	public String identifyChord(String[] notes){
	
		String[] chords = {"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"};

		String res = null;

		
		for( int i=0; i< 13; i++ ){
			String[] triad = {chords[i], chords[i+4], chords[i+7]};
			
			if(Arrays.hashCode(triad) == Arrays.hashCode(notes)){
				res = chords[i];
			}
		
		}
		return res;

	}
		
	class GuitarString {
		public String[] Notes = {
			"A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#", "A", "A#", "B", "C", "C#", "D", "D#", "E", "F", "F#", "G", "G#"	
		};
	
		public String stringName;

		GuitarString(String _stringName){
			stringName = _stringName;
		}

		public String getFrettedNote(int fret){
			return Notes[ArrayIndexOf(Notes, stringName) + fret];
		}

		private int ArrayIndexOf(String[] notes, String value){
			for(int i = 0; i < notes.length; ++i){
				if ( notes[i] == value ){
					return i;
				}
			}
			return -2 * Notes.length;
		}
		
			
	}// GuitarString



}//Guitar
