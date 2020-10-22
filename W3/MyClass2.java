enum Level{
    HIGH,
    MEDIUM,
    LOW
}
public class MyClass2{
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;
    
    switch (myVar) {
        case HIGH: 
            System.out.println("High Level");
            break;
        case LOW: 
            System.out.println("Low Level");
            break;
        case MEDIUM: 
            System.out.println("Medium Level");
            break;
        }
    }
}