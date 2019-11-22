public class DC32 {
    public void myFunction(int a){
        if(a < 10){
            System.out.println("I am in If Part");
        } else {
            System.out.println("I am in Else Part");
        };
    }
    public static void main(String[] args) {
        DC32 myObj = new DC32();
        myObj.myFunction(7);
        myObj.myFunction(12);        
        }    
    
}