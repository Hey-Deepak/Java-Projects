public class DC3 {
    String myName;
    Integer myAge;
    final int myFinal = 21;

    public static void main(String[] args) {
        DC3 myInfo = new DC3();
        myInfo.myName = "HeyDeepak";
        myInfo.myAge = 20;
      //  myInfo.myFinal = myInfo.myAge; 
      // Cannot assign a value to final variable. 
        System.out.println("My Name is " + myInfo.myName + " and My Age is " + myInfo.myFinal);
    }

}