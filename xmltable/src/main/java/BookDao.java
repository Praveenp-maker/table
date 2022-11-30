import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;

public class BookDao extends HttpServlet {
    private String jdbcURL="jdbc:mysql://localhost:3306/xmlcrud?serverTimezone=UTC";
    private String jdbcUsername="root";
    private String jdbcPassword="";
    private Connection jdbcConnection;


    public boolean insertItem(Book book) throws SQLException {
    jdbcConnection=DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
        String sql = "INSERT INTO listtable (id) VALUES (?)";
     
        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
       
         
        boolean rowInserted = statement.executeUpdate() > 0;
        statement.close();
      
        return rowInserted;
    }


    public List<Book> listAllCustomers() throws SQLException {
        List<Book> bookl = new ArrayList<Book>();         
        String sql = "SELECT * FROM listtable";         
            
        Statement statement = jdbcConnection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
         
        while (resultSet.next()) {
            int id = resultSet.getInt("customerid");
            String title = resultSet.getString("title");
           Book book = new Book(id, title, title, id);
            
          book.setAuthor("author");
        //  book.setPrice("price");

          bookl.add(book);
        }
         
        resultSet.close();
        statement.close();
         
       
        return bookl;
         
        
    }

    public static void deletebook(Book deletebook) throws SQLException {
    //    String sql = "DELETE FROM customer where customerid = ?";
         
 
         
       // PreparedStatement statement = jdbcConnection.prepareStatement(sql);
      //  statement.setInt(1,BookDao.getid());
         
       // boolean rowDeleted = statement.executeUpdate() > 0;
        //statement.close();
     
     
    }


    public static void updatebook(BookDao updatebook) {

        System.out.println("update");
    }


//     public static boolean updatebook(BookDao updatebook) throws SQLException {
//         String sql = "UPDATE customer SET customername = ?";
//         sql += " WHERE customerid = ?";
    
         
//        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
//        statement.setString(1, Book.getTitle());
//         statement.setInt(2, Book.getid());
         
//         boolean rowUpdated = statement.executeUpdate() > 0;
//         statement.close();
//   //
//         return rowUpdated;     
//     }
}
