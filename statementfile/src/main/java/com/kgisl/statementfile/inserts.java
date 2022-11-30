package com.kgisl.statementfile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class inserts {
    public static void main(String[] args) {
        
        try(
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/kgislbook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");   
                Statement stmt = conn.createStatement();
               
             ) {
                String sqlInsert = "insert into kgisl values (6, 'Gone Fishing', 11.11, 11)";
                System.out.println("The SQL statement is: " + sqlInsert + "\n");  // Echo for debugging
                int countInserted = stmt.executeUpdate(sqlInsert);
                System.out.println(countInserted + " records inserted.\n");
             
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
