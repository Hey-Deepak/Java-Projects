class Vehicle {
    public String brand = "Ford";
    public void honk(){
        System.out.println("Tuuu  Tuuu  Tuuu");
    }
}
public class Car extends Vehicle{
    public String modelName = "Mustang";
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}