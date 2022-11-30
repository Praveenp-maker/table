package db;

import java.io.IOException;


import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Serv2")
public class Serv2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // String g=getServletContext().getInitParameter("DBUSER");
    //  ServletContext context = getServletContext();
      
    //     System.out.println(context.getAttribute("Servlet"));
    //     System.out.println(getServletContext().getInitParameter("DBUSER"));
        RequestDispatcher rd = req.getRequestDispatcher("/salem.jsp");
        rd.forward(req, resp);


    }

}
