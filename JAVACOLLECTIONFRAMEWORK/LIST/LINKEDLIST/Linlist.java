import java.util.*;

public class Linlist{
  public static void main(String[] args) {

    LinkedList<Integer> ll  = new LinkedList<>();

    ll.add(1);
    ll.add(2);
    ll.add(3);
    

    ll.add(0,1);
    ll.addFirst(1010);
    ll.addLast(2121);
    System.out.println(ll);

    System.out.println(ll.get(1));
    System.out.println(ll.getFirst());
    System.out.println(ll.getLast());

    ll.remove(0);
    ll.remove(Integer.valueOf(1011));
    System.out.println(ll);
    ll.removeFirst();
    ll.removeLast();

    
  }
}