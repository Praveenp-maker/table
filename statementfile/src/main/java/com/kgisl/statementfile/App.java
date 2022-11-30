package com.kgisl.statementfile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class App 
{
    public static void main( String[] args ) throws SQLException
    {

        
        try(
        Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/kgislbook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
            "root", "");   
            Statement stmt = conn.createStatement();
           
         ) {
                String old = "select * from kgisl where rollno = 3";
              System.out.println(old);
              String strUpdate = "update kgisl set salary = salary*100, name = name where rollno = 3";
            int row  =  stmt.executeUpdate(strUpdate);
             System.out.println(row);

           
             String strSelect = "select * from kgisl where rollno = 3";
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
    
    
    }}
