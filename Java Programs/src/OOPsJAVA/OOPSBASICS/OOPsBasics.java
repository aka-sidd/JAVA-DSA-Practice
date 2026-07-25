package OOPsJAVA.OOPSBASICS;
import java.util.*;
public class OOPsBasics {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Siddharth";
        s1.rno = 101;
        s1.age = 22;
        s1.CollegeName = "GalgotiasUniversity";


        s2.name = "Rachna";
        s2.rno = 102;
        s2.age = 22;
        s2.CollegeName = "Delhi University";

        s1.MarkAttendance();
        s2.MarkAttendance();

        s1.print();
        s2.print();

    }
}
class Student {
    String name;
    int rno;
    int age;
    String CollegeName;
    void MarkAttendance(){
        System.out.println("Attendance Marked by " +name);
    }
    void print(){
        System.out.println(name + ", " + rno + ", "+age + " " + CollegeName);
    }
}
