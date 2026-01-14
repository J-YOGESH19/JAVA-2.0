package SORTING;
import java.util.Arrays;
public class Insertionsort {

  public static void insertionSort(int[] arr){

    for(int i = 1 ; i<arr.length ; i++){
      int temp = i;
      int j = i - 1;

      while (j>= 0 && arr[j] > temp){
        arr[j+1] = arr[j];
        j -- ; 
            }

      arr[j+1] = temp;
    }}


  public static void main(String[] args){

    int [] arr = { 21,22,12,13,451,2};
    insertionSort(arr);

    System.out.println(Arrays.toString(arr));

   
  
}


}
