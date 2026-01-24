package OOPsJAVA;

class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing Something");
    }
    public void FindInfo(){
        System.out.println(this.color);
        System.out.println(this.type);
    }

}
class Student {
    String name;
    int age;
    int roll_no;

    public void StudentInfo(String name) {
        System.out.println(name);
    }
    public void StudentInfo(int age){
        System.out.println(age);
    }
    public void StudentInfo(String name,int age){
        System.out.println(name + " "+ age);

    }
}
public class OOps{
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.name = "Siddharth";
        s1.age = 21;
        s1.roll_no=55;

        s1.StudentInfo(s1.age);
        s1.StudentInfo(s1.name);

    }
}


