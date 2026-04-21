package OOPsJAVA.Polymorphism;
//Overriding Code
class Bank {
    void RateOfInterest(){
        System.out.println("Rate of Interest of Bank is 5%");
    }
}
class SBI extends Bank {
    @Override
    void RateOfInterest(){
       System.out.println("Rate of Interest of SBI is 6%");
   }
}
class PNB extends Bank {
    @Override
    void RateOfInterest(){
        System.out.println("Rate of Interest of PNB is 6.5%");
    }
}

//Overloading Code
class OverloadingDemo {
    void sum(int a,int b){
        System.out.println(a+b);
    }
    void sum(int a,int b,int c){
        System.out.println(a+b+c);
    }
    void sum(String a,String b){
        System.out.println(a+b);
    }
}
public class PolymorphismDemo {
    public static void main(String[] args) {
        Bank b = new Bank();
        PNB b1 = new PNB();
        SBI b2 = new SBI();
        b.RateOfInterest();
        b1.RateOfInterest();
        b2.RateOfInterest();
//        OverloadingDemo obj = new OverloadingDemo();
//        obj.sum(5,7);
//        obj.sum(5,7,8);
//        obj.sum("Siddharth", "Pandey");
    }
}
