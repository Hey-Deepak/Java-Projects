public class DC25 {
    public static void main(String[] args) {
        String[] myName = {"Deepak", "Babu", "Suraj"};
        myName[2] = "DC";
        for (int i = 0; i < myName.length; i++) {
        System.out.println(myName[i]);
        }
        System.out.println(myName.length);
    }
}