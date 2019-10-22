public class NestedIf
{
    public static void main(String[] args)
     {
        int students = 0;
        int rooms = 0;

        if (students > 0) 
        {
            if(rooms > 0)
            System.out.println("In-side Nested If Statement");
        } 
        else 
        {   
            System.out.println("Out-side Nested If Statement" );
        }
    }
}