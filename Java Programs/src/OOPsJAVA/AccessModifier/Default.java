package OOPsJAVA.AccessModifier;
class Student {
    String name;
    int age;
    int roll_no;
    void print(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(roll_no);
    }
}
public class Default {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.name = "Siddharth";
        obj.age = 21;
        obj.roll_no = 45;
        obj.print();
    }

}
