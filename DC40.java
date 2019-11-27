import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class DC40 {
    public static void main(String[] args) {
        try {
            File myFile = new File("DC.txt");
            Scanner myReader = new Scanner(myFile);
            String data = myReader.nextLine();
            System.out.println(data);
        } catch (FileNotFoundException e) {
            System.out.println("AN Error Occurred");
        }
    }
}