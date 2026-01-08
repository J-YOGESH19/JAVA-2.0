package ARRAY;
import java.util.*;
public class arraydeclaration{
  public static void main(String[] args) {
    int arr[] = {1,2,22,3,4,5,5};
    char[] arr1 = { 'd' , 'w' , 'a'};
    System.out.println(arr.length);
    System.out.println(Arrays.toString(arr));


    Arrays.sort(arr);
    System.out.println(Arrays.toString(arr));

  }
}