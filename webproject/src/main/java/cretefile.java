import java.io.File;
 
import java.io.IOException;   
public class cretefile {
    public static void main(String[] args){
        try{
            File fo=new File("D:created.txt");
            if(fo.createNewFile()){
                System.out.println("created new file"+fo.getName());
                System.out.println("The absolute path of the file is: " + fo.getAbsolutePath());     
   
                // Checking whether the file is writable or not  
                System.out.println("Is file writeable?: " + fo.canWrite());    
       
                // Checking whether the file is readable or not  
                System.out.println("Is file readable " + fo.canRead());    
       
                // Getting the length of the file in bytes  
                System.out.println("The size of the file in bytes is: " + fo.length());    
            }
            else{
                System.out.println("already havr");
            }
        }
        catch(IOException exception){
            System.out.println("unexpected error");
exception.printStackTrace();
        }
    }
}
