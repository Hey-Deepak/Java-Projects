public class Array2
{
    public static void main(String[] args)
     {
        
        float[] theVal = {0.5f, 0.5f, 0.5f,}; 
        float sum = 0.0f;

        for(float currentValue : theVal)
        {
            sum += currentValue;
            System.out.println(sum);
        }
        System.out.println("final sum :-" + sum);
    }
}