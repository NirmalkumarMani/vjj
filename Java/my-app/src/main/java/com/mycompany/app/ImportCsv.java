/*package com.mycompany.app;

import java.util.*;
import java.io.*;
import java.sql.*;
import java.lang.*;
public class ImportCsv
{
public static void main(String args[])
{
read();
upload();
}
static void upload()
{
Connection connection = DBconnection.getDBconnection();
try
{
String loadQuery ="LOAD DATA LOCAL INFILE '" + "C://Users//nirmalkumar.m//Downloads//bank.csv" + "' INTO TABLE Student FIELDS TERMINATED BY ','" + " LINES TERMINATED BY '\n' (address,dept,name,roll) ";
//System.out.println(loadQuery);
Statement stmt = connection.createStatement();
stmt.execute(loadQuery);
System.out.println("Upload successfully");
}
catch (Exception e)
{
e.printStackTrace();
}
}
static public void read()
{
try
{
Scanner scanner = new Scanner(new File("C://Users//nirmalkumar.m//Downloads//bank.csv"));
scanner.useDelimiter(",");
while(scanner.hasNext()){
System.out.print(scanner.next()+"-");
}
scanner.close();
}
catch(Exception ex)
{
ex.printStackTrace();
}
}
}*/



