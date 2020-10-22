import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyClass3 {
    public static void main(String[] args) {
        LocalDateTime myDateTime = LocalDateTime.now();
        System.out.println("Befor Formating :-" + myDateTime);
        DateTimeFormatter myDateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy & hh:mm:ss");
        String myformatedDateTime = myDateTime.format(myDateTimeFormatter);
        System.out.println("After Formatting :-" + myformatedDateTime);
    }
}