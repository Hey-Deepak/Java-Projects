interface Animal{
    public void animalSound();
    public void sleep();
}
class Pig implements Animal{
    public void animalSound(){
        System.out.println("Pig says :- wee  wee...");
    }
    public void sleep(){
        System.out.println("Zzzz Zzzz...");
    }
}
public class MyMainClass2{
    public static void main(String[] args) {
        Pig myPig = new Pig();
        myPig.animalSound();
        myPig.sleep();
    }
}