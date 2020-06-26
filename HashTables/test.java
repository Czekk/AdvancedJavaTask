import java.util.*;
public class test{
  public static void main(String[] args){
   
    Set<Integer> s = new LinkedHashSet<Integer>();
   
   for (int i=0; i< 100000000;i++){
     s.add(i);
   }
   while(true){
	   try{
     Thread.sleep(1000);
   }
   catch(Exception e){
   }
   }


}
}
