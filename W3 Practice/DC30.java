public class DC30 {
    public void myNameAge(String x, Integer y){
        System.out.println("Name :-" + x + "\nage :-" + y);
    }
    public static void main(String[] args) {
        DC30 myObj = new DC30();
        myObj.myNameAge("Deepak", 21);
    }
}