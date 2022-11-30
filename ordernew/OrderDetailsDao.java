import java.util.List;
public interface OrderDetailsDao {
    public void createOrder(OrderDetail orderDetail);
    public void updateOrder(OrderDetail orderDetail);
    public void deleteOrder(OrderDetail orderDetail);
    public List<OrderDetail>getallOrder();
    public void getOrderDetail(OrderDetail orderDetail);
    public void updateOrder(int d, String string);
}
