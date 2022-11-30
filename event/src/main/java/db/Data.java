package db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Data extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
Connection conn=null;
Statement stmt=null;
ResultSet rs=null;
String qry="select * from atman";

try {
conn=DriverManager.getConnection(getServletContext().getInitParameter("DBURL"), getServletContext().getInitParameter("DBUSER"), "");
stmt=conn.createStatement();
rs=stmt.executeQuery(qry);
while(rs.next()){
String name=rs.getString("username");
int pass=rs.getInt("password");
System.out.println(name+" "+pass);

}



} catch (SQLException e) {

e.printStackTrace();

}





// String s= getServletContext.getInitParameter();

//String d= getServletContext.getInitParameter();



}
}

