package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/edit")
public class Tupdate extends HttpServlet {
 
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
          

           int id = Integer.parseInt(req.getParameter("id"));
            System.out.println(id);
            resp.sendRedirect("update.jsp");
     

        } 

    
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   
    Connection conn = null;

    PreparedStatement stmt = null;

    try {

        String qry = "update bookstore.books set title= ?,author= ?,price= ?, qty= ? WHERE id =?";
        conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");
        System.out.println("Enter The updating Values...");

      int  id = Integer.parseInt(req.getParameter("id"));
        String title = req.getParameter("title");
        System.out.println(title);
        String author = req.getParameter("author");
        System.out.println(author);
        Float price = Float.parseFloat(req.getParameter("price"));
        System.out.println(price);
        System.out.println("checking.....");
        int qty = Integer.parseInt(req.getParameter("qty"));
        System.out.println(qty);
        

        stmt = conn.prepareStatement(qry);

        stmt.setString(1, title);
        stmt.setString(2, author);
        stmt.setFloat(3, price);
        stmt.setInt(4, qty);
        stmt.setInt(5, id);

        stmt.executeUpdate();

        System.out.println("data updated");
        System.out.println(id + " " + title + " " + author + " " + price + " " + qty);
        RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
        rd.forward(req, resp); 
}
catch(SQLException e){
    e.printStackTrace();
}
}
}