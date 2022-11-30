
    public class Jstr {
        int id;  
        String name;  
        float price;  
        public Jstr(int id, String name, float price) {  
            this.id = id;  
            this.name = name;  
            this.price = price;  
        }
        @Override
        public String toString() {
            return "Jstr [id=" + id + ", name=" + name + ", price=" + price + "]";
        }
        public int length() {
            return 0;
        }  
        
    }  

