package JAVACOLLECTIONFRAMEWORK.MAP;
import java.util.*;
public class HasMap {
public static void main(String[] args) {
    HashMap<String , Integer> map  =  new HashMap<>();


    map.put("India" , 120);
    map.put("US" , 30);
    map.put("China" , 150); 

    System.out.println(map);
    map.put("China" , 13121);
    System.out.println(map);


    if(map.containsKey("China")){
        System.out.println("Key is present in the map ");


    
    }
  


    System.out.println(map.get("China"));
}

}
