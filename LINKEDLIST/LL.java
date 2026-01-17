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


//Insert at the end
 public void inserEnd(int val){
  if(tail == null){
    insertFirst(val);
    return ;
  }

  Node node = new Node(val);
  tail.next = node;
  tail = node;
  size += 1;



 }

//Insert at some specific index 
public void insert(int val , int index){
  if(index == 0){
    insertFirst(val);
    return;
  }

  if(index == size){
    inserEnd(val);
    return ;
  }

  Node temp = head;
  for(int i = 1 ; i < index ; i++){
    temp  = temp.next;

  }

  Node node = new Node(val, temp.next );
  temp.next = node;
  size ++;
}

//delete at first 
public int deletefirst(){

  int val = head.value;
  head = head.next;
  size--;

  if(head == null){ //in this condition suppose their is one element  in the linked list so we can prmote the head pointer to head.next which is null and tail still pointing on that so tail == null
    tail = null;
  }
  
  return val;

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