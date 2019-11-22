public class DC2 {
    String myName;
    Integer myAge;
    final int myFinal = 21;

    public static void main(String[] args) {
        DC2 myInfo = new DC2();
        myInfo.myName = "HeyDeepak";
        myInfo.myAge = 20;
        myInfo.myFinal = myInfo.myAge;
        System.out.println("My Name is " + myInfo.myName + " and My Age is " + myInfo.myFinal);
    }

}