package OOPsJAVA.AccessModifier;
class PrivateMethod {
    private String name;
    private int rno;
    private int age;

    PrivateMethod(String name,int rno,int age){
        this.name = name;
        this.rno = rno;
        this.age = age;
    }
     private void print(){
        System.out.println(name);
        System.out.println(rno);
        System.out.println(age);
    }
    //getters
    public void show(){
        print();
    }

}
public class Private {
    public static void main(String[] args) {
        PrivateMethod obj1 = new PrivateMethod("Siddharth",21,21);
       obj1.show();
    }
}
