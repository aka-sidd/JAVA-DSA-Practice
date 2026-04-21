package OOPsJAVA.OOPSIntro;
class Students{
    int id;
    int age;
    public Students(int id,int age){
        this.id = id;
        this.age = age;
        System.out.println("Parametrized Constructor Called!!");
    }
    public Students(){
        System.out.println("Default Constructor Called!!");
    }
    public Students(int id,int age,String name){
        System.out.println("Parametrized Constructor 2 called");
    }
}
public class Constructor {
    public static void main(String[] args) {
//        Students obj = new Students();
//        Students obj1 = new Students(5,20);
        Students obj2 = new Students(5,20,"Siddharth");

    }
}
