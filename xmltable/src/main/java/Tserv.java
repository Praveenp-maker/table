import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

@WebServlet("/new")
public class Tserv extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        System.out.println("get all list");
        ArrayList<Book> booklist = new ArrayList<Book>();
        booklist.clear();

        booklist.add(new Book(1, "ponnin", "kalki", 90));
        booklist.add(new Book(2, "virumandi", "kamal", 123));
        booklist.add(new Book(3, "kuselan", "rajini", 32));
        booklist.add(new Book(4, "selvan", "nayagan", 98));
        Gson g = new Gson();
        String cars = g.toJson(booklist);
        res.getWriter().print(cars);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("get");
        String requestData = req.getReader().lines().collect(Collectors.joining());
        Book newBook = new Gson().fromJson(requestData, Book.class);
        System.out.println("requestData Length->" + requestData.length());
        System.out.println("requestData->" + requestData);
        System.out.println(newBook.getId() + " " + newBook.getTitle());
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doDelete called");
        String requestData = req.getReader().lines().collect(Collectors.joining());
        Book deletebook = new Gson().fromJson(requestData, Book.class);
        System.out.println("requestData Length->" + requestData.length());
        System.out.println("requestData->" + requestData);
        System.out.println(deletebook.getId() + " " + deletebook.getPrice());

        try {
            BookDao.deletebook(deletebook);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPut called");
        String requestData = req.getReader().lines().collect(Collectors.joining());
        BookDao updatebook = new Gson().fromJson(requestData, BookDao.class);
        System.out.println("requestData Length->" + requestData.length());
        System.out.println("requestData->" + requestData);
        // System.out.println(updatebook.getId()+" "+updatebook.getAuthor());

        BookDao.updatebook(updatebook);

    }

}
