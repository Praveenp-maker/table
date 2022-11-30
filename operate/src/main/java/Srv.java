import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Srv extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


      
      
      System.out.println("srv doget called");
      String Web=getServletContext().getInitParameter("Web");
      System.out.println(Web);

      String school=getServletContext().getInitParameter("school");
      System.out.println(school);

      String college=getServletConfig().getInitParameter("email");
      System.out.println(college);
     

      String work=getServletConfig().getInitParameter("email");
      System.out.println(work);


      try {
        Thread.sleep(2000);
        System.out.println("_______________THE END____________");
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }
  }
  static  void display(){
    System.out.println("static method called");
  }
  static{
    System.out.println("static block");
  }
  {
    System.out.println("non-static block");
  
    }
    public Srv(){
      System.out.println("constructor called");
    }
    public void Nmethod(){
      System.out.println("method created");
    }
    public static void main(String[] args){
      Srv h=new Srv();
      h.Nmethod();
      Srv.display();
      String s="INTERMISSION";
      for(int i=0;i<s.length();i++){
try {
  Thread.sleep(2000);
  System.out.println(i);
} catch (InterruptedException e) {
  // TODO Auto-generated catch block
  e.printStackTrace();
}

      }
    }
    }
   

