public class CallAMethod1 {
    static int myMethod(int x){
        return x + x;
    }
    public static void main(String[] args) {
       System.out.println("After Adding.." +  myMethod(10));
       System.out.println("After Adding.." +  myMethod(20));
       System.out.println("After Adding.." +  myMethod(30));
    }
}
