public interface OrderDao {

    public void createOrder(OrderDetails orderdetails);
    public void updateOrder(long orderid,OrderDetails orderDetails);
    public void deleteOrder(OrderDetails orderDetails);
    public list<OrderDetails> getAllOrderlist();
    public void getOrderDetails(OrderDetails orderDetails);
}
