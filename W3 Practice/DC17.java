public class DC17 {
    public static void main(String[] args) {
        char myChar = '-';
        int a = 10;
        int b = 20;
    
        switch (myChar) {
            case '+': 
                System.out.println(a + b);
                break;
            case '-': 
                System.out.println(a - b);
                break;
            case '/': 
                System.out.println(a / b);
                break;    
            default:
                System.out.println("Something went Wrong...");
                
        }
    }
}