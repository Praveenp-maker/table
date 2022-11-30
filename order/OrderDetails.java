
public class OrderDetails {
    long orderid;
    

    int productid;
    int customerid;
    String date;
    float quantity;
    float price;
    public long getOrderid() {
        return orderid;
    }

    public void setOrderid(long orderid) {
        this.orderid = orderid;
    }
    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public OrderDetails(long orderid, int productid, int customerid, String date, float quantity, float price) {
        this.orderid = orderid;
        this.productid = productid;
        this.customerid = customerid;
        this.date = date;
        this.quantity = quantity;
        this.price = price;
    }

    public String toString() {
        // TODO Auto-generated method stub
        return  productid+" "+customerid+""+date+" "+quantity+" "+ price;
    }

}