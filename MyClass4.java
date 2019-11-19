import java.util.ArrayList;
import java.util.Collections;

public class MyClass4 {
    public static void main(String[] args) {
        ArrayList<Integer> myNumber = new ArrayList<Integer>();
        myNumber.add(32);
        myNumber.add(10);
        myNumber.add(21);
        myNumber.add(67);
        myNumber.add(46);
        System.out.println("Before Sorting...");
        System.out.println(myNumber);
        Collections.sort(myNumber);
        System.out.println("After Sorting :- " );
        for( int i : myNumber){
            System.out.println(i);
        }
    }
}