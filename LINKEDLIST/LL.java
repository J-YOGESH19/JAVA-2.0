public class LL{

  private Node head;
  private Node tail;
  private int size;
  public LL(){
    this.size = 0 ;

    }

//display
public void display(){
  Node temp = head;
  while(temp != null){
    System.out.print(  temp.value + "->");
    temp = temp.next;
  }
  System.out.println("END");
}


//Insert at first 
  public void insertFirst(int val){
    Node node = new Node(val);
    node.next = head; 
    head = node;

    if(tail == null){
      tail = head;
    }

    size += 1;
  }


//

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