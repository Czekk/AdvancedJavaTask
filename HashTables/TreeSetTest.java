import java.util.*;
public class TreeSetTest{
  public static void main(String[] args){
   Comparator<String> comp = (String::compareTo);
    Set<String> s = new TreeSet<String>(comp.reversed());
   boolean b1 = s.add("Apple");
   boolean b4 = s.add("FooBar");
   boolean b2 = s.add("Orange");
   boolean b3 = s.add("less");


  for (String str : s){
    System.out.println(str);
  }
  }



}

