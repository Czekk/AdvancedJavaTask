import java.util.*;
public class LinkedHashSetTest{
  public static void main(String[] args){
   
   Set<String> s = new LinkedHashSet<String>();
   boolean b1 = s.add("Apple");
   boolean b4 = s.add("FooBar");
   boolean b2 = s.add("Orange");
   boolean b3 = s.add("less");


  for (String str : s){
    System.out.println(str);
  }
  }



}

