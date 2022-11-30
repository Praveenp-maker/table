package display;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * display
 */
public class Display extends HttpServlet {
  private ServletRequest request;
@Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    System.out.println(" display Get Method");
    System.out.println(resp.getWriter());
   
    String userName=request.getParameter("userName");  
    String userPass=request.getParameter("userPass");  
   
   System.out.println(userName);
   System.out.println(userPass);
    // super.doGet(req resp);
  }
  {
    System.out.println("non static block");
  }
}