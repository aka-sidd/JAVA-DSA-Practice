package OOPsJAVA.OOPSIntro;

public class OOpsClass {
        public static class Student { //USer defined data type
            String name; // name as a string
            int rno; //rno as a integer
            double percent;//percent as a double...
        }
        public static class Car{
            String name;
            String type;
            int price;
            String model;
        }

    public static void main(String[] args) {
        Student x = new Student();
        x.name = "Siddharth";
        x.rno = 76;
        x.percent = 65.8;
        System.out.println(x.name);
        System.out.println(x.rno +8);
        System.out.println(x.percent+9);

        Car c = new Car();
        c.name = "Altroz";
        c.price = 8500000;
        c.type = "Hatchback";
        c.model = "XM+";

        System.out.println(c.name);
        System.out.println(c.price);
        System.out.println(c.model);
        System.out.println(c.type);
    }
    }
