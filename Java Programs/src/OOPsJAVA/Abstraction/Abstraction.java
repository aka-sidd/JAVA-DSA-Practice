package OOPsJAVA.Abstraction;
abstract class Car {
    abstract public void fuelType();
    public void CarColor(){
        System.out.println("Color is Red");
    }
}
class Tata extends Car {
    public void fuelType(){
        System.out.println("Petrol type");
    }
}
class Mahindra extends Car {
    public void fuelType(){
        System.out.println("Diesel Type");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Mahindra obj = new Mahindra();
        obj.fuelType();
        obj.CarColor();
    }
}
