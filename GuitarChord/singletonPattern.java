public class singletonPattern{
	private static singletonpattern s = null;

	public static int i;
	 
	private singletonPattern(){
		i = 1;
	}

	public static singletonPattern getInstance(){
		if (s == null ){
			s = new singletonPattern();
		
		}
		return s;

		
	}


	public static void main(String[] args){
	
		singletonPattern k = singletonPattern.getInsatnce();
	}














}
