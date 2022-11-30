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
@WebServlet("/poo")
public class Deletes extends HttpServlet {
    {
        System.out.println("came");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("came");
        Connection conn = null;
        PreparedStatement pst = null;
        String qry = "DELETE FROM books where id=?";
        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bookstore?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                    "root", "");
            pst = conn.prepareStatement(qry);

            // System.out.println("Enter The Values to be deleted...");
            int id = Integer.parseInt(req.getParameter("id"));

            pst.setInt(1, id);
            pst.executeUpdate();
            System.out.println(qry);
            System.out.println(pst);
            System.out.println("data deleted");

        
          RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
          rd.forward(req, resp);
        }

        catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
