// import java.util.HashMap;
// import java.util.Map;
// import java.util.Map.Entry;
// public class Hmap {
// public static void main(String[] args) {
//          HashMap<Integer,String> books = new HashMap<Integer,String>();
//          books.put(1, "ps1");
//          books.put(2,"daysofourlife");
//          books.put(3,"thinklikeamonk");
//          books.put(4, "lic");
//          for(books.Entry h:books.entrySet()){
//             System.out.println(h.getKey()+" "+h.getValue());
//          } 
//     }
// }java
import java.util.*;  
public class Hmap{  
 public static void main(String args[]){  
   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
   map.put(1,"Mango");  //Put elements in Map  
   map.put(2,"Apple");    
   map.put(3,"Banana");   
   map.put(4,"Grapes");   
       
   System.out.println("Iterating Hashmap...");  
   for( Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
}  