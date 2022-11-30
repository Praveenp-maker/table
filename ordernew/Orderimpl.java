
    import java.util.ArrayList;
    import java.util.List;
    class Orderimpl implements OrderDetailsDao{
       
        
    public List<OrderDetail> order=new ArrayList<OrderDetail>();

    
        
        public void createOrder(OrderDetail orderdetail) {
            

             
        OrderDetail o1=new OrderDetail(12,2,8,"third",6.9f,1.0f);
          OrderDetail o2=new OrderDetail(13,6,7,"fourth",5.8f,3.4f);
         order.add(o1);
         order.add(o2);
        
        }
    
        public void updateOrder(int orderid, OrderDetail orderDetail) {
            // TODO Auto-generated method stub
            
//System.out.print(OrderDetail.get(orderid)+"it is updated");
        }
    
        public void deleteOrder(OrderDetail orderDetail) {
            // TODO Auto-generated method stub
          //  order.remove(long orderid);
            //System.out.print(Orderdetail.get(orderid)+"it is deleted";
            
        }
    
        
    
        public  List<OrderDetail>getallOrder() {
            // TODO Auto-generated method stub
            return order ;
            
        }
    
        public void getOrderDetail(OrderDetail orderDetail) {
            // TODO Auto-generated method stub
            
            
        }

        public void updateOrder(OrderDetail orderDetail) {
            // TODO Auto-generated method stub
            
        }

        @Override
        public void updateOrder(int d, String string) {
            // TODO Auto-generated method stub
            
        }
        



    }
    
        
    
        