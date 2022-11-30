package controller;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/")
public class ControllerServlet extends HttpServlet {
   public  List<Book> listBook;
   
 
   
    /* (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                String jdbcURL = "jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC";
                String jdbcUsername = "root";
                String jdbcPassword = "";
                String qry="Select * from books";
                listBook = new ArrayList<Book>();
                ResultSet rs=null;
                PreparedStatement ps=null;
               
      try{
           

            Connection con=DriverManager.getConnection(jdbcURL,jdbcUsername,jdbcPassword);

          ps=con.prepareStatement(qry);
     
         rs= ps.executeQuery();
        while(rs.next()){
            int id=rs.getInt("id");
            String title=rs.getString("title");
            String author=rs.getString("author");
            int price = rs.getInt("price");
            int qty=rs.getInt("qty");
            listBook.add(new Book(id, title, author, price,qty));
          //  System.out.println(id+" "+title+" "+author+" "+price);
        

      }
         request.setAttribute("listBook", listBook);
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
//         request.setAttribute("Book", listBook); //categorylist is an arraylist      contains object of class category  
// getServletConfig().getServletContext().getRequestDispatcher("/Display.jsp").forward(request,response);
    }
    catch(SQLException e){
        e.printStackTrace();
    }
    
    
            }
            



    
        }