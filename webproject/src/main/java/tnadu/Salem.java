package tnadu;
import java.io.IOException;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Salem extends HttpServlet {
   
  //private ServletResponse response;
    //private ServletRequest request;
  //private ServletRequest request;
  @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      System.out.println(" display Get Method");
       System.out.println(resp.getWriter());
      // response.setContentType("text/html");  
      // try (PrintWriter out = response.getWriter()) {
      // }  
            
     
    //   String userName=request.getParameter("userName");  
    //   String userPass=request.getParameter("userPass");  
     
    //  System.out.println(userName);
    //  System.out.println(userPass);
      // super.doGet(req resp);
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      System.out.println("dopost called");
   
    {
      System.out.println("non static block");
    }
    }}