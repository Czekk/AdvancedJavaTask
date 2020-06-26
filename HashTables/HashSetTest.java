import java.util.*;
public class HashSetTest{
  public static void main(String[] args){
    Set<Integer> s = new HashSet<Integer>();
   boolean b1 = s.add(new Integer(1000));
   boolean b2 = s.add(new Integer(12)); 
   boolean b3 = s.add(new Integer(17));

   System.out.println(b1);
   System.out.println(b2);
   System.out.println(b3);
  
  for (Integer str : s){
    System.out.println(str);
  }
  }



}
