public class DC33 {
    public int myInt(int x, int y){
        return x + y;
    }
    public double myInt(Double x, Double y){
        return x + y;    
    }
    public static void main(String[] args) {
        DC33 myObj = new DC33();
        System.out.println(myObj.myInt(11, 22));
        System.out.println(myObj.myInt(11.22d, 22.33d));
    }
}