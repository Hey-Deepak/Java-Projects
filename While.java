public class While
{
    public static void main(String[] args) {
        
        int val1 = 5;
        int fact = 5;
        

        while (val1 > 1) {
            fact *= --val1; 
        }
        System.out.println(fact);
    }
}