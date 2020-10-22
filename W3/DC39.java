import java.io.FileWriter;
import java.io.IOException;

public class DC39{
    public static void main(String[] args) {
        try {
            FileWriter myFile = new FileWriter("DC.txt");
            myFile.write("Hey My Self Deepak Choudhary");
            myFile.close();
            System.out.println("Successfully wrote to File...");
        } catch (IOException e){
            System.out.println("Error...");
        }
    }
}