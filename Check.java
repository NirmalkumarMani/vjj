import java.util.*;
class Student
{
    String name;
    String clg ;
    String branch ;
    double per;
    
     Student(String s1,String s2,String s3,double p)
     {
         name=s1;
         clg=s2;
         branch=s3;
         per=p;
     }
 
}
class Check
{
	public static void main(String arg[]) 
	{	
	     HashMap<Integer, Student> hm=new HashMap<Integer, Student>();
	 
                Student x1=new Student("goutham","SNIST","cse",68.5);
                Student x2=new Student("kanakesh","SNIST","ecm",70);
                Student x3=new Student("rahul","SNIST","ecm",75);
                Student x4=new Student("vasista","SNIST","ECM",80);
                Student x5=new Student("narayana","SNIST","EEE",85);
	        hm.put(1,x1);
	        hm.put(2,x2);
	        hm.put(3,x3);
	        hm.put(4,x4);
	        hm.put(5,x5); 
	   Iterator trav=hm.entrySet().iterator();
	while(trav.hasNext())
	{
		Map.Entry record=(Map.Entry)trav.next();  
        System.out.println(record);
		Student j=(Student)record.getValue();
                System.out.println(record.getKey()+" "+j.name+" "+j.clg+" "+j.branch+" "+j.per);
	}
       }
}