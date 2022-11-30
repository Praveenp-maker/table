
    package com.kgisl.statementfile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class deleter{
    public static void main(String[] args) {
        
        try(
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kgislbook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");   
                Statement stmt = conn.createStatement();
               
             ) {
                String sqlDelete = "delete from kgisl where rollno=3 ";
                System.out.println("The SQL statement is: " + sqlDelete + "\n");  // Echo for debugging
                int countDeleted = stmt.executeUpdate(sqlDelete);
                System.out.println(countDeleted + " records deleted.\n");
             
                String strSelect = "select * from kgisl";
                System.out.println("The SQL statement is: " + strSelect + "\n");
                 ResultSet rset = stmt.executeQuery(strSelect);
               System.out.println(rset);
                
                while(rset.next()) {   
                    String name = rset.getString("name");  
                   float salary = rset.getFloat("salary");  
                    float dob   = rset.getFloat("dob");       
                 System.out.println(name+ ", " + salary+" ,"+dob);
                
              }
            }
              catch(SQLException e)
              {
                  e.printStackTrace();
              }
              
    }
}

    

