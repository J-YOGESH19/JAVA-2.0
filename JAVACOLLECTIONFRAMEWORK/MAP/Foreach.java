public class Foreach{
  public static void main(String[] args){

    int arr[] = {12,15,18};
    for (int i =  0 ; i<arr.length ; i++){
      System.out.print(arr[i] + " ");
    }
    System.out.println();


    for(int val : arr){
      System.out.println(val);
    }
 
  }
  
}