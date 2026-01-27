package OOPsJAVA;

public class PassingClassesToMethod {
    public static class Car {
        int seats;
        String name;
        double length;
        String type;
        int torque;
    }
    public static void main(String[] args) {
     Car c = new Car();
     c.length = 3.99;
     c.name = "Sonet";
     c.seats = 5;
     c.type = "SUV";
     change(c);
        System.out.println(c.seats);
    }
    private static void change(Car c){
        c.seats = 4;
    }
}
