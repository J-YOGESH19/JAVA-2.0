package SEARCHING;


public class Linearsrch {

  public static int lineserch(int arr[] , int value){
    for (int i  = 0 ; i < arr.length ; i++){
      if(arr[i] == value ) {
        return i;
      }
    }

    return -1;

  }

  public static void main(String[] args) {

    int arr[] = { 1 ,2 ,3, 4, 5,6 ,7 };


    int index = lineserch(arr, 2);

    if(index != -1){
      System.out.println("Element found at index : " + index);
    }

    else {
      System.out.println("Element not found");
    }
    
  }

  
}
