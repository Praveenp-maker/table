package com.kgisl.readfile;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class App 
{
    /**
     * @param args
     * @throws SQLException
     */
    public static void main( String[] args ) throws SQLException
    {
        System.out.println( "Hello World!" );
       Connection conn = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC","root","");   // For MySQL only
             Statement stmt = conn.createStatement();
       {
         String strSelect = "select title, price, qty from books";
         System.out.println("The SQL statement is: " + strSelect + "\n"); 
          ResultSet rset = stmt.executeQuery(strSelect);
          System.out.println("The records selected are:");
         int rowCount = 0;
        while(rset.next()) {   
            String title = rset.getString("title"); 
           String author=rset.getString("author");
            double price = rset.getDouble("price"); 
            int    qty   = rset.getInt("qty");       
            System.out.println(title);
            ++rowCount;
         }
         System.out.println("Total number of records = " + rowCount);
 
     
    }}}

