
import guitar.*;
import java.io.FileWriter;

public class Main{
	
	public static void main(String[] args){
		
		Guitar myGuitar = Guitar.getInstance();
			FileWriter fw;
		try{
			fw = new FileWriter("CMajShapeChords.txt");	
			String shapeChords = null;
			for(int i=0; i<13 ; i++){
				shapeChords = myGuitar.CMajShape(i) +"\n";
				fw.write( shapeChords);
			}
			fw.close();
		}
		catch( Exception e ){
			System.out.println(e.getMessage());
		}
	
	
		}
	}
