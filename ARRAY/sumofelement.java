package ARRAY;
public class sumofelement {

  public static void main(String[] args){

    int [] arr = { 1, 2 ,34 ,3 ,3 ,3 };

    int sum = 0 ;
    for(int i = 0 ; i < arr.length; i++){
      sum += arr[i];
    }

    System.out.println(sum);

  } 
  
}
