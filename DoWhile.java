public class DoWhile
{
    public static void main(String[] args) {
        
        int val1 = 5;
        do {
            System.out.print(val1);
            System.out.print("* 2 = ");
            val1 *= 2;
            System.out.println(val1);
        } while (val1 < 100);
        
        System.out.println("Happy Ending.. :-)");
    }
}