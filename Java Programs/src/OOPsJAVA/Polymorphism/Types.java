package OOPsJAVA.Polymorphism;
class A {
    static void show(){
        System.out.println("A");
    }
}
class B extends A {
    static void show(){
        System.out.println("B");
    }
}
//    void sum(){
//        System.out.println("Sum is 9");
//    }
//}
//class B {
//     void sum(){
//        System.out.println("sum is 10");
//    }
//}
public class Types {
    public static void main(String[] args) {
        A obj = new B();
        obj.show(); //output is A because static method does not override its only a method hiding...Decision makes at compile time
//        A obj = new A();
//        B obj1 = new B();
//      obj.sum();
//      obj1.sum();
//
    }
}
