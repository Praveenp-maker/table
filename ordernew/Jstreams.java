import java.util.ArrayList;
import java.util.List;
import java.util.Map;
//import java.util.stream.Collectors;  
import java.util.stream.Collectors;

public class Jstreams {  
    public static void main(String[] args) {  
        List<Jstr> productsList = new ArrayList<Jstr>();  
        //Adding Products  
        productsList.add(new Jstr(1,"HP Laptop",25000f));  
        productsList.add(new Jstr(2,"Dell Laptop",30000f));  
        productsList.add(new Jstr(3,"Lenevo Laptop",28000f));  
        productsList.add(new Jstr(4,"Sony Laptop",28000f));  
        productsList.add(new Jstr(5,"Apple Laptop",90000f));  
        // List<Float> productPriceList2 =productsList.stream()  
        //                              .filter(p -> p.price > 30000)// filtering data  
        //                              .map(p->p.price)        // fetching price  
        //                              .collect(Collectors.toList()); // collecting as list  
        // System.out.println(productPriceList2);  
       // productsList.forEach(System.out::println);  

       Map<Boolean, List<Jstr>> partitionByNameLength = productsList.stream()
        .collect(Collectors.partitioningBy(name -> name.length() > 4));

System.out.println(partitionByNameLength);
    }  
}  

