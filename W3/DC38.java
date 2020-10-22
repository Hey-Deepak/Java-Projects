import java.io.File;
import java.io.IOException; 
   
public class DC38{
    public static void main(String[] args) {
        try {
        File myFile = new File("DC.txt");
            if(myFile.createNewFile()){
                System.out.println("File Created:- " + myFile.getName());
            } else {
                System.out.println("File already Exists");
            }
        } catch(IOException e) {
                System.out.println("Error ...:-(");
                e.printStackTrace();
                  
        }
    }
}