public class DC37 {
    String name;
    int age ;
    public DC37(String x, int y){
        name = x;
        age = y;
    }
    public static void main(String[] args) {
        DC37 myObj = new DC37("Deepak", 21);
        System.out.println("MY name is " + myObj.name +".\nAge is " + myObj.age);
    }
}
