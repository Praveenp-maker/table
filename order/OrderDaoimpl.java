import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class OrderDaoimpl implements OrderDao {
    Scanner u=new Scanner(System.in);
public list<OrderDetails>order;
    public void createOrder(OrderDetails orderdetails) {
        
        order=new ArrayList();
        int p=u.nextInt();
        int c=u.nextInt();
        String date=u.next();
        float quantity=u.nextfloat();
        float price=u.nextfloat();
        order o1=new order(12,2,"third",78.9,65.8);
        order o2=new order(12,2,"third",78.9,65.8);
     OrderDetails.add(o1);
     OrderDetails.add(o2);
        
    }

    public void updateOrder(long orderid, OrderDetails orderDetails) {
        // TODO Auto-generated method stub
        
    }

    public void deleteOrder(OrderDetails orderDetails) {
        // TODO Auto-generated method stub
        
    }

    public void getAllOrder() {
        // TODO Auto-generated method stub
        
    }

    public void getAllOrderlist() {
        // TODO Auto-generated method stub
        return OrderDetails();
        
    }

    public void getOrderDetails(OrderDetails orderDetails) {
        // TODO Auto-generated method stub
        
    }
    
}
