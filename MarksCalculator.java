import java.util.Scanner;

public class MarksCalculator {

    public static void main(String[] args) {

        float firstInSem, secondInSem, finalSem, assignment, attendance;
        float total;
        Scanner myFirstInSem = new Scanner(System.in);
        Scanner mySecondInSem = new Scanner(System.in);
        Scanner myFinalInSem = new Scanner(System.in);
        Scanner myAssignment = new Scanner(System.in);
        Scanner myAttendance = new Scanner(System.in);

        System.out.println("Enter your 1st or 3rd In-Sem Marks:-\n");
        firstInSem = myFirstInSem.nextFloat();
        System.out.println("Enter your 2nd or 3rd In-Sem Marks:-\n");
        secondInSem = mySecondInSem.nextFloat();
        System.out.println("Enter your Final Sem Marks:-\n");
        finalSem = myFinalInSem.nextFloat();
        System.out.println("Enter your Assignment Marks:-\n");
        assignment = myAttendance.nextFloat();
        System.out.println("Enter your Attendance Marks:-\n");
        attendance = myAssignment.nextFloat();
        total = ((firstInSem) * 30) / 100 + (secondInSem * 30) / 100 + (finalSem * 50) / 100 + (assignment)
                + (attendance);
        System.out.println("Your Total Marks :- " + total);

        if (total >= 35) {
            System.out.println("You are Safe and you crossed Danger Zone, Your extra marks is " + (total - 35));
        } else
            System.out.println("You are UnSafe and you have to gain " + (35 - total) * 2
                    + "more marks.\n Means Next time in Final Back Paper you have to score "
                    + (finalSem + (35 - total) * 2));

    }
}