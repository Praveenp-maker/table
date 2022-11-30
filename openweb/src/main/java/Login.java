import javax.servlet.http.HttpServlet;

    import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Login extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                System.out.println("Login");
        // String username = request.getParameter("username");
        // String password = request.getParameter("password");
        // System.out.println(username + " " + password);
        RequestDispatcher rd = request.getRequestDispatcher("servlet2");
        rd.include(request, response);
        System.out.println(request.getParameter("username") + " " + request.getParameter("password")+" "+ request.getAttribute("cat"));
        
    }

}

