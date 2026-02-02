package OOPsJAVA.Polymorphism;

public class Polymorphism {
    public static class Dog {
        void speak(){
            System.out.println("Bark");
        }
    }
    public static class Cat {
       void speak(){
           System.out.println("Meow Meow");
       }
    }
    public static class Lion {
       void speak(){
           System.out.println("Roar");
       }
    }
    public static class Pikachu{
        void speak(){
            System.out.println("Pika Pika");
        }
    }
    public static class Human {
         void speak(){
             System.out.println("Hello");
         }
    }
    public static void main(String[] args) {
         Human sid = new Human();
         Pikachu p = new Pikachu();
         Dog d = new Dog();
         Cat c = new Cat();
         d.speak();
         c.speak();
         sid.speak();
         p.speak();
    }
}
