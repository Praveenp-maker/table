package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/new")
public class Insert  extends HttpServlet{
    ControllerServlet c=new ControllerServlet();



   
      @Override
      protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     
      
        Connection conn=null;
        PreparedStatement stmt=null;

       
        String qry="insert into books values(?,?,?,?,?)";

        try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC","root","");
           
            System.out.println("Enter The Inserting Values...");
            for (Book b:c.listBook) {
                System.out.println(b);
                
            }
            int id=  Integer.parseInt(req.getParameter("id"));
            String title=req.getParameter("title");
            String author=req.getParameter("author");
            float price=Float.parseFloat(req.getParameter("price"));
            int qty=  Integer.parseInt(req.getParameter("qty"));
           
            // if(containsName(c.listBook,title)){
            //     System.out.println("invalid title");
            //     String sr="Invalid Title";
            //     req.setAttribute("error", sr);
            //     RequestDispatcher requestDispatcher=req.getRequestDispatcher("update.jsp");
            //     requestDispatcher.forward(req, resp);


            // }
            // else{
            stmt=conn.prepareStatement(qry);
                stmt.setInt(1, id);
                stmt.setString(2, title);
                stmt.setString(3, author);
                stmt.setFloat(4, price);
              
                stmt.setInt(5, qty);
                stmt.executeUpdate();
             System.out.println("data inserted");
             System.out.println(id+" "+title+" "+author+" "+price+" "+qty);
             RequestDispatcher rd=req.getRequestDispatcher("index.jsp");
             rd.forward(req, resp);
            
                 
        }
    
        catch(SQLException e){
            e.printStackTrace();
        }
    
    
       
    }
    public boolean containsName(final List<Book> list, final String name){

        return list.stream().filter(o -> o.getTitle().equals(name)).findFirst().isPresent();

    }
}
