package com.kgisl.statementfile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class prepstate {
    public static void main(String[] args) {
        
    
    try{
        Connection conn = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/kgislbook?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
            "root", "");   
            PreparedStatement stmt=conn.prepareStatement("select * from kgisl where rollno=3");  

            stmt.setInt(0, 7777);
           
            ResultSet ss = stmt.executeQuery();
            System.out.println("hai");
            System.out.println(ss);



//stmt.setString(1,"Sonuuu");//1 specifies the first parameter in the query i.e. name  
//stmt.setInt(2,87);  

  
 
System.out.println(ss+" records updated");  
String strSelect = "select * from kgisl";
                System.out.println("The SQL statement is: " + strSelect + "\n");
                 ResultSet rset = stmt.executeQuery(strSelect);
               System.out.println(rset);
                
                while(rset.next()) {  
                    int rollno=rset.getInt("rollno"); 
                    String name = rset.getString("name");  
                   float salary = rset.getFloat("salary");  
                    float dob   = rset.getFloat("dob");       
                 System.out.println(rollno+","+name+ ", " + salary+" ,"+dob);
                
              }
conn.close();  
    }
catch(Exception e){ System.out.println(e);}  
  
}
}