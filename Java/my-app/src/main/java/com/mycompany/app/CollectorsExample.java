package com.mycompany.app;
import java.util.stream.Collectors;  
import java.util.List;  
import java.util.*;  
import java.util.ArrayList;  
import java.lang.String;
import java.lang.Float;
class product1
    {  
    int id;  
    String name;  
   float price;  
      
    public product1 (int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
    public int getId() {  
        return id;  
    }  
    public String getName() {  
        return name;  
    }  
    public float getPrice() {  
        return price;  
    }  
}  
public class CollectorsExample {  
    public static void main(String[] args) {  
        List<product1> product1sList = new ArrayList<product1>();  
      
        product1sList.add(new product1(1,"HP Laptop",25000f));  
        product1sList.add(new product1(2,"Dell Laptop",30000f));  
        product1sList.add(new product1(3,"Lenevo Laptop",28000f));  
        product1sList.add(new product1(4,"Sony Laptop",28000f));  
        product1sList.add(new product1(5,"Apple Laptop",90000f));  
        Long noOfElements = product1sList.stream()  
                               .collect(Collectors.counting());  
   //  List<String> list = product1sList.stream().map(product1::getPrice).collect(Collectors.toList());
        System.out.println("Total elements : "+noOfElements);  
      //  System.out.println(list);  
      Map<Integer,String> li=product1sList.stream()
                        .collect(Collectors.toMap(p->p.id, p->p.name));
                     
                          
        System.out.print(li);

    }  
}  