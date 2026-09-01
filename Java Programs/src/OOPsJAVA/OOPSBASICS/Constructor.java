package OOPsJAVA.OOPSBASICS;
import java.util.*;
public class Constructor {
    public static void main(String[] args){
        Students s1 = new Students("Siddharth",22,101,"GU"); // This is called Parametrized Constructor...
        //default values
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s1.rno);
        System.out.println(s1.College);
        s1.markAttendance();
    }
}
class Students {
    String name; // information/data/characterstics--> instance Variable
    int age;
    int rno;
    String College;

    //Default constructor
    Students() {
    }

    Students(String n, int a, int rn, String c) {
        name = n;
        age = a;
        rno = rn;
        College = c;

    }

    void markAttendance() { // behaviours-->methods--> instance methods
        System.out.println("Attendance Marked by: " + name);
    }
}
   class Demo {
       public static void main(String[] args) {
           Students1 s1 = new Students1();
           Students1 s2 = new Students1("Siddharth");
           Students1 s3 = new Students1("Rachna",22);
           Students1 s4 = new Students1("Rachna",22,102);
           Students1 s5= new Students1("Siddharth",21,101,"GU");
           System.out.println(s3.College_Name);

       }
  }
    class Students1 {
        String name;
        int rno;
        int age;
        String College_Name;

        //Constructor Overload...

        Students1() {
            this("Unknown",0,0,"Unknown");
        }

        Students1(String name) {
            this(name,0,0,"Unknown");
        }

        Students1(String name, int age) {
            this(name,age,0,"Unknown");

        }

        Students1(String name, int age, int rno) {
            this(name,age,rno,"Unknown");
        }
        Students1(String name, int age, int rno, String College_Name) {
            this.name = name;
            this.age = age;
            this.rno = rno;
            this.College_Name = College_Name;
        }
        void MarkAttendances() {
            System.out.println("Attendance Marked By : " + name);
        }

    }


