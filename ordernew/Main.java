public class Main
{
	public static void main(String args[]){
        OrderDetailsDao obj=new Orderimpl();
        obj.createOrder(null);
System.out.println(obj.getallOrder());

      
    
    }
}
