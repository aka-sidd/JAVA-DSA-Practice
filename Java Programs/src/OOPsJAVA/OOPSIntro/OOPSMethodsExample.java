package OOPsJAVA.OOPSIntro;
class Dog {
    int License_ID;
    String name;
    public void eat(){
        System.out.println(name + " eats");
    }
}
public class OOPSMethodsExample {
   public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "bruno";
        d1.eat();
    }
}
