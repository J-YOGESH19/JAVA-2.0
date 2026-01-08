package ARRAY;
import java.util.*;
public class insertioninbegginig {
  public static void main(String[] args){

    int[] arr  =  new int[6];
    arr[0] = 10; 
    arr[1] = 20;
    arr[2] = 30;
    arr[3] = 40;
    arr[4] = 50;

    int n  = 5;
    int value = 5;

    for (int i = n  ; i > 0 ; i--){
      arr[i] = arr[i - 1];
    }
      
  arr[0] = value;

System.out.println(Arrays.toString(arr));
    }
  }

