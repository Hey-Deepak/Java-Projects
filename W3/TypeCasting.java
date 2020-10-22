public class TypeCasting{
    public static void main(String[] args) {
        
        short shortVal = 3;
        int intVal = 12;
        long longVal = 123;
        float floatVal = 12.12f;
        double doubleVal = 12.1212d;

        long result1 = (intVal - shortVal) + (long)doubleVal;

        System.out.println("Success... :-)");
    }
}