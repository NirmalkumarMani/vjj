package com.mycompany.app;
interface A
{
default void display()
{
    System.out.println("Go");
}
 void display1();


}
interface B 
{
    default void display()
    {
        System.out.println("Hello");
    }

}

class Question 
{
   public void display()
   {
       System.out.println("Hai");
   }
    public static void main(String args[])
    {
        Question q=new Question();

     q.display();
    }
}
