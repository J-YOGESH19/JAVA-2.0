package JAVACOLLECTIONFRAMEWORK.SET.HASHSET;
import java.util.HashSet;
import java.util.Iterator;

public class Hasset {

  public static void main(String[] args){ 

    //IN SET ONLY UNIQUE ELEMENT STORE 


      HashSet <Integer> set = new HashSet<>();


      //Insert 

      set.add(1);
      set.add(2);
      set.add(3);
      set.add(1);

System.out.println("The size of the set is :"  + set.size());


      //Search  - contains

      if(set.contains(1)){
        System.out.println("Set contain 1");
      }


      //Delete
      set.remove(1);
      if (!set.remove(1)){
        System.out.println("does not contain 1 - we have removed 1");
      }


     //to print all element
     System.out.println(set );


     Iterator <Integer> it = set.iterator();

     while(it.hasNext()){
      System.out.println(it.next());
     }

      


  }

  }
  

