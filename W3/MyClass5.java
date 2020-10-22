import java.util.HashMap;
public class MyClass5{
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<String, Integer>();
        people.put("Deepak", 21);
        people.put("Lavish", 20);
        people.put("Saurabh", 19);
        for(String i : people.keySet()){
            System.out.println("Name :- " + i + ", Age :-" + people.get(i));
        }
    }
}