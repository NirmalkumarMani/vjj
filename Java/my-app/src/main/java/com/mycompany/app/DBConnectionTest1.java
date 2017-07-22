package com.mycompany.app;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;
import java.sql.ResultSet;

import java.sql.*;

public class DBConnectionTest1 {

    public static void main(String[] args) {
        Connection conn = DBConnection.getDBConnection();

        try {
             // String query ="Select * from employee order by salary desc limit 3";
              //String query ="Select * from employee where salary =14000";
             String query = "Select * from employee INNER JOIN projectemployee where employee.id = projectemployee.id";

             Statement statement = conn.createStatement();
           ResultSet resultSet = statement.executeQuery(query);
          //  ResultSet resultSet = conn.createStatement().executeQuery("Select * from employee order by salary desc limit 3;");

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1)+"\t"+resultSet.getString(2)+"\t"+resultSet.getString(3)+"\t"+resultSet.getString(4)+"\t"+resultSet.getString(5)+"\t"+resultSet.getString(6)+"\t"+resultSet.getString(7)+"\t"+resultSet.getString(8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}