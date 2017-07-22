/*package com.mycompany.app;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.*;
import java.sql.ResultSet;

public class DBConnectionTest {

    public static void main(String[] args) {
        Connection conn = DBConnection.getDBConnection();

        try {
           // String query = "SELECT * FROM employee WHERE doj BETWEEN '04/05/2017' AND '08/05/2017'";
       
      String query = "Select id,name,team_id,doj,email,salary from employee where salary >=(select max(salary) from employee where salary < (select max(salary) from employee where salary < (select max(salary) from employee)))order by salary";

            Statement statement = conn.createStatement();
           ResultSet resultSet = statement.executeQuery(query);
        }

            while (resultSet.next()) {
                System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4)+" "+resultSet.getString(5)+" "+resultSet.getString(6));
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
/*PreparedStatement statement1 = conn.prepareStatement(sql);


ResultSet resultSet = statement.executeQuery("select * from student");

while (resultSet.next()) {
System.out.println(resultSet.getString(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3)
+ " " + resultSet.getString(4));
}
} catch (Exception e) {
e.printStackTrace();
}

}
}*/
