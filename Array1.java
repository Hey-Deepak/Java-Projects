public class Array1
{
    public static void main(String[] args)
     {
        
        float[] theVal = new float[3];
        theVal[0] = 0.5f;
        theVal[1] = 0.5f;
        theVal[2] = 0.5f;
        float sum = 0.0f;

        for(int i = 0; i < theVal.length ; i++)
        {
            sum += theVal[i];
            System.out.println(sum);
        }
        System.out.println("final sum :-" + sum);
    }
}