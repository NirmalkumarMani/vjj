package com.mycompany.app;
import java.sql.*;
class DBConnection
{
static Connection con=null;
private DBConnection()
{

}
public static Connection getDBConnection()
{
try 
{
if(con==null) 
{
Class.forName("com.mysql.jdbc.Driver");
con=DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_details","root","");
}

} 
catch (Exception e) 
{
e.printStackTrace();
}
return con;
}
}