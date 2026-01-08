package JAVACOLLECTIONFRAMEWORK.ARRAYLIST;

import java.util.Arrays;
import java.util.ArrayList;

public class Arraylsicollec {
  public static void main(String[] args) {

    ArrayList<Integer> l1 = new ArrayList<>();

    // add() this method is used to add element and can be use for add the elemet to
    // add in specific location

    // add(index,element)
    l1.add(2);
    l1.add(3);
    l1.add(4);
    System.out.println(l1);
    l1.add(1, 12);
    System.out.println(l1);

    // get() - this method is used to access the element

    // get(index);

    int a = l1.get(0);
    System.out.println(a);


    //Sometime we have to update the element in the array
    //We use a method set()
    //set(index , newelement)

    l1.set(0,3);
    System.err.println(l1);



    //remove() to remove the element from the array 
    l1.remove(0);
    l1.remove(Integer.valueOf(12));

    System.err.println(l1);
  l1.add(2);
  l1.add(33);
  l1.add(221);
  l1.add(89);
  System.out.println(l1);


    //now we will see how to know the number of element present in it 
    // we will use size();

    System.out.println(l1.size());


    for(int  i = 0 ; i < l1.size(); i++){
      System.out.print(  l1.get(i) + " ");
    }
     

    System.out.println();

    ArrayList<String> listS = new ArrayList<>();
    listS.add("A");
     listS.add("B");
      listS.add("C");
      listS.add("D");

    System.out.println(listS.size());


    //now i am going to study about the contains() method it will check wheather the element is present in the list , so if it is present so it will return true or false

    System.out.println(listS.contains("A"));



    //isEmpty();
    
    System.out.println(listS.isEmpty());


    //clear(); BY THE NAME OF the method we can remove the element from the list 
    listS.clear();
    System.out.println(listS);
    System.out.println(listS.isEmpty());

  //toArray


    Integer[] arr = l1.toArray(new Integer[0]);
    System.out.println(Arrays.toString(arr));
    Object[] arr1 = l1.toArray();
    System.out.println(Arrays.toString(arr));


    //next method is addAll()
 //in this method we will add the element from the list 1 to list 2 
 
  ArrayList<Integer> list1 = new ArrayList<>();
  list1.add(1);
  list1.add(2);

  ArrayList<Integer> list2 = new ArrayList<>();
  list2.add(3);
  list2.add(4);

  list1.addAll(list2);
  System.out.println(list1);

  list1.removeAll(list2);
  System.out.println(list1);
    

  System.out.println(list1.equals(list2));






  }
}