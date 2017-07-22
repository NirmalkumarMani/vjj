package com.mycompany.app;
import javax.swing.JButton;  
import javax.swing.JFrame;  
import javax.swing.JTextField;  
public class Button {  
    public static void main(String[] args) {  
        JTextField tf=new JTextField();  
        tf.setBounds(50, 50,150,20);  
          JTextField ts=new JTextField();  
        ts.setBounds(50, 50,150,20);  
        JButton b=new JButton("click");  
        b.setBounds(80,100,70,30);  
           JButton c=new JButton("ok");  
        c.setBounds(80,100,70,30);  
        // lambda expression implementing here.  
        b.addActionListener(e-> {tf.setText("hello swing");});  
         c.addActionListener(e-> {ts.setText("welcome");});  
        
        
        JFrame f=new JFrame(); 
         JFrame s=new JFrame(); 
        s.add(ts);s.add(c);
        f.add(tf);f.add(b);  
         s.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        s.setLayout(null);  
        s.setSize(300, 200);  
        s.setVisible(true);  
  
          
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        f.setLayout(null);  
        f.setSize(300, 200);  
        f.setVisible(true);  
  
    }  
  
}  