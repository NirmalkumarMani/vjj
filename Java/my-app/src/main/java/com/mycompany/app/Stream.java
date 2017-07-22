/*package com.mycompany.app;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.sql.*;
import java.sql.ResultSet;
import java.util.*;
public class EmployeeDetails {

public static void main(String[] args) {
Connection conn = DBConnection.getDBConnection();
List<Employee> list = new ArrayList<Employee>();
try {
Statement statement = conn.createStatement();

String sql = "select * from emp_details";
ResultSet resultset = statement.executeQuery(sql);

while (rs.next()) {
Employee e = new Employee();
e.setId(resultset.getInt("id"));
e.setName(resultset.getString("name"));
e.setTeam(resultset.getString("team"));
e.setDoj(resultset.getString("doj"));
e.setemail(resultset.getString("email"));
e.setSalary(resultset.getDouble("salary"));
list.add(e);
System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " "
+ rs.getString(4) + " " + rs.getString(5)+ " " + rs.getString(6));
}
System.out.println();
System.out.println("***************using filter to display highest salary above 30000**********************************");
List<Employee> list2 = new ArrayList<Employee>();
Statement statement2 = conn.createStatement();
String sql2="select * from emp_details order by salary desc";
ResultSet rs2 = statement.executeQuery(sql2);
while (rs2.next()) {
Employee e = new Employee();
e.setId(rs2.getInt("id"));
e.setName(rs2.getString("name"));
e.setTeam(rs2.getString("team"));
e.setDoj(rs2.getString("doj"));
e.setSalary(rs2.getDouble("salary"));
list2.add(e);}
list2.stream().limit(3).forEach(System.out::println);
//System.out.println(list2);
System.out.println();

System.out.println("*****************print all employee using stream*********************");
List<String> list1 = list.stream().map(Employee::toString).collect(Collectors.toList());

System.out.println("id name team doj salary");
System.out.println();

Iterator iterator = list1.iterator();
while (iterator.hasNext()) {
System.out.println(iterator.next());
}

System.out.println("*****************print join employee using stream*********************");
List<Employee> list3 = new ArrayList<Employee>();
Statement statement1 = conn.createStatement();
String sql1="select * from emp_details inner join project on emp_details.id=project.id";
ResultSet rs1 = statement.executeQuery(sql1);
while (rs1.next()) {
Employee e = new Employee();
e.setId(rs1.getInt("id"));
e.setName(rs1.getString("name"));
e.setTeam(rs1.getString("team"));
e.setDoj(rs1.getString("doj"));
e.setSalary(rs1.getDouble("salary"));
list3.add(e);
System.out.println(rs1.getString(1) + " " + rs1.getString(2) + " " + rs1.getString(3) + " "
+ rs1.getString(4) + " " + rs1.getString(5));
}

} catch (Exception e) {
e.printStackTrace();
}

}
}*/