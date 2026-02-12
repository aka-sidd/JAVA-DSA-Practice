package OOPsJAVA.Encapsulation;

public class Encapsulation {
    private int age;
    private String name;

    public int getAge(int age) {
        return age;

    }
       public void setName(String n){
        name = n;
       }
    public String getName() {
        return name;
    }
}


class Demo {
    public static void main(String[] args) {
    Encapsulation e = new Encapsulation();
        System.out.println(e.getAge(21));
       e.setName("Siddharth");
        System.out.println(e.getName());
    }
}
