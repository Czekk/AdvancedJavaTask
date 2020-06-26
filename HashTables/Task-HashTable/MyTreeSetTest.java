import java.util.*;
public class MyTreeSetTest{
  public static void main(String[] args){
   
    Set<String> set1 = new TreeSet<String>();
    Set<String> set2 = new TreeSet<String>();
    set1.add(new String("Hello"));
    set1.add(new String("World"));
    set1.add(new String("Cup"));
    set2.add(new String("Math"));
    set2.add(new String("Grass"));
    set2.add(new String("less"));
    set1.addAll(set2);
    set2.clear();
    String str = new String("Math");
    set1.contains(str);
    set1.containsAll(set2);
    set2.isEmpty();
    Object[] objArray = new Object[set1.size()];
    objArray = set1.toArray();
	System.out.println(Arrays.toString(objArray));
  }

}
