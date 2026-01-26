package DOUBLYLINKEDLIST;

public class DLL {

  private Node head ; 



  public void insertFirst(int val){

    Node node = new Node(val);

    node.next = head;
    node.prev = null;
    if(head != null){
      head.prev = node;
    }
    head = node;
    


  }


  public void display(){
    Node node = head ; //we cant move head because it will alter the value of the dll 
    while(node != null){
      System.out.print(node.val + " -> ");
      node =node.next;
    }

    System.out.println();
  }

//display in reverse 
  //to diaply in reverse we have to go to the last node 

  public void displayrev(){
    Node node = head ;

    while(node != null & node.next != null){
      node = node.next ;
    }

    while (node!= null){
      System.out.print(node.val + " -> ");
      node = node.prev;
    }

    System.out.println();
  }


  //insert at last 
  public void insertLast(int val) {
    Node node = new Node(val);

    if (head == null) {
        head = node;
        return;
    }

    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }

    temp.next = node;
    node.prev = temp;
}

//insert at particular position 

public void insertAt(int index , int val){
  
  if(index == 0){
    insertFirst(val);
    return ;
  }

  Node temp = head ; 

  for (int i = 1; i < index ; i++){
    temp = temp.next ;

    if(temp == null){
      System.out.println("Invalid index");
      return ; 
    }
  }

  Node node = new Node(val);

  node.next = temp.next ;
  node.prev = temp;

  if(temp.next != null){
    temp.next.prev = node;
  }

  temp.next = node;
}



  private class Node{
    int val;
    Node next;
    Node prev;

    public Node(int val){
      this.val = val;
    }

    public Node(int val , Node next , Node prev){
      this.val = val;
      this.next = next ;
      this.prev = prev;
    }

  }
  
}
