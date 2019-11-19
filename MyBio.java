import java.util.Scanner;

public class MyBio {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Name, Age, Salary...");
        String name = myObj.nextLine();
        int age = myObj.nextInt();
        long salary = myObj.nextLong();

        System.out.println("Name :-" + name);
        System.out.println("Age :-" + age);
        System.out.println("Salary :-" + salary);
    }
}