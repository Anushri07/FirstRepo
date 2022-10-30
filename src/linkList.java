import java.util.*;
public class linkList {
    public static void main(String args[]){
     LinkedList<String> list =new LinkedList<String>();
      list.addFirst("A");
      list.addFirst("B");
      list.addLast("C");
      list.addLast("D");
      
      System.out.println(list);
      System.out.println(list.size());

      for(int i=0;i<list.size();i++){
        System.out.print(list.get(i)+"->");
      }
      System.out.println("null");
    list.removeFirst();
    list.removeLast();
    System.out.println(list);
    list.remove(1);
    System.out.println(list);
    }
}


