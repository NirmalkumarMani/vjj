package com.mycompany.app;
import javax.swing.*;  
class Twofield
{
 public static void main(String args[])  
    {  
    JFrame f= new JFrame("TextField Example");  
    JTextField t1,t2;  
    t1=new JTextField("Welcome to Javatpoint.");  
    t1.setBounds(50,100, 200,30);  
    
    
    t2=new JTextField("AWT Tutorial");  
    t2.setBounds(50,150, 200,30);  
    JButton b=new JButton("click");  
        b.setBounds(80,100,70,30); 
     
           b.addActionListener(e-> {b.setText("welcome");});  
  f.add(t1); f.add(t2);  f.add(b);
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);  
    }  
    }  