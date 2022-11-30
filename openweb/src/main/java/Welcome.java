import javax.servlet.http.HttpServlet;


    import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Welcome extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("WelcomeServlet");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println(username + " " + password);

        request.setAttribute("cat", "Hello World");
    }

}


