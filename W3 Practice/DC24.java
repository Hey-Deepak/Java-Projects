public class DC24 {
    public static void main(String[] args) {
        String[] myName = {"Deepak", "Babu", "Suraj"};
        myName[2] = "DC";
        for (String i : myName) {
        System.out.println(i);
        }
        System.out.println(myName.length);
    }
}