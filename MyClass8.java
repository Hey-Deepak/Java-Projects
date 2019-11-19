public class MyClass8 {
    static void checkAge(int age){
        if (age < 18) {
            throw new ArithmeticException("Access Denied - You are under Age.");
        } else {
            System.out.println("Access Granted - you are Old enough.");
        }
    }
    public static void main(String[] args) {
      checkAge(20);  
      }
}


