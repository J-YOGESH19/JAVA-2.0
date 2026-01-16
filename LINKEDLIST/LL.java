public class LL{

  private Node head;
  private Node tail;
  private int size;
  public LL(){
    this.size = 0 ;

    }

  private class Node{

    private int value;
    private Node next;

    public Node (int value){   //initialize  without knowing the next 
      this.value = value;

    }

    public Node(int value , Node next){ // when the next value is know 
      this.value = value;
      this.next = next ;
    }
  }

}