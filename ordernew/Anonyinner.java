 interface  red {
     void eat();
     void year();
}
public class Anonyinner{
 public static void main(String[] args) {
    red f=new red() {
        public void eat(){
            System.out.println("run time creation");
        }

        @Override
      public   void year() {
            System.out.println("invoking year");
            
        }
    };
    f.eat();
    f.year();

    
}
}
