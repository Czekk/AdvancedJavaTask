import java.util.*;
public class MyLinkedListTest{
  public static void main(String[] args){
    MyObj a = new MyObj();
    MyObj b = new MyObj();
    MyObj c = new MyObj();
    MyObj d = new MyObj();
    MyObj e = new MyObj();
    MyObj f = new MyObj();
    List<MyObj> list1 = new LinkedList<MyObj>();
    List<MyObj> list2 = new LinkedList<MyObj>();
    list1.add(a);
    list1.add(b);
    list1.add(c);
    list2.add(d);
    list2.add(e);
    list2.add(f);
    list1.addAll(list2);
    list2.clear();
    list1.contains(c);
    list1.containsAll(list2);
    list2.isEmpty();
    Object[] ObjArray = new MyObj[list1.size()];
    ObjArray = list1.toArray();

  }

  static class MyObj{
    int i;
    public MyObj(){
      i = 1;
    }
  }
}
