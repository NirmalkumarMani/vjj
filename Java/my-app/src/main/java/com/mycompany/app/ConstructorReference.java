package com.mycompany.app;
interface Messageable{  
    Message getMessage(String msg);  
    //Message getMessage(String msg);  
}  
class Message{  
    public Message(String msg){  
        System.out.print(msg);  
    }  
}  
public class ConstructorReference {  
    public static void main(String[] args) {  
        Messageable hello = Message::new; 
        Messageable hi=Message::new; 
        hello.getMessage("Hello");  
        hi.getMessage("hi");
    }  
}  