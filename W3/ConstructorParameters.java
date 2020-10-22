public class ConstructorParameters {
    int modelYear;
    String modelName;

    public ConstructorParameters(int year, String name){
        modelYear = year;
        modelName = name;
    }
    public static void main(String[] args) {
        ConstructorParameters myCar = new ConstructorParameters(1956, "Mustang");
        System.out.println("My Car Name is "+ myCar.modelName +" and Modeal Year is"+ myCar.modelYear);
    }
}