package db;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("doget called");
        RequestDispatcher rd = req.getRequestDispatcher("/Serv2");
        rd.forward(req, resp);

        ServletContext cs = getServletContext();
        cs.setInitParameter("data", "007");

        // {
        //     System.out.println("nonstatic block");
        // }
    }
}
