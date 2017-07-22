package com.mycompany.app;
interface Sayable{  
    void say();  
}  
public class Method {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = Method::saySomething;  
        // Calling interface method  
        sayable.say();  
    }  
}  