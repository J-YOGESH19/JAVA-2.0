package SEARCHING;
import java.util.Arrays;


public class Binarysrch {
  public static void main(String[] args) {

    int[] arr = {10 , 20 , 30 , 40}; //Element in the array must be sorted 
    int target = 30;
    // int index = Arrays.binarySearch(arr, 3);

    int index  = binarySearch(arr  , target );

    if(index != -1){
      System.out.println("Element found at index :" + index );
    }

    else{
      System.out.println("Notfound");
    }




        
  }

      public static int  binarySearch(int [] arr , int target){

      int low = 0;
      int high = arr.length - 1;

      while (low <= high){

        int mid = low + (high - low ) / 2 ;

        if ( arr[mid] == target){
          return mid;
        }

        else if ( arr[mid] < target){
          low = mid + 1;
        }

        else 
        {
          high = high -1 ;
        }


      }

      return -1 ;




    }
  
}
