package OOPsJAVA.OOPSIntro;
import java.util.*;
 // create own datatype
public class UserDefinedDataType {
    public static class Student { // create own datatype
        String name;
        int rno;
        double cgpa;
        void study(){
            System.out.println(name + " is studying: ");
        }
        void print(){
            System.out.println(name + " " + rno+ " "+ cgpa);
            study();
        }

    }
    public static void main(String[] args) {
        //User input using scanner class making its object from scanner class
        Scanner sc = new Scanner(System.in);
       Student s1 = new Student(); // declaration
        s1.name = "Siddharth";
        s1.rno = 11863;
        s1.cgpa = 7.0;

        Student s2 = new Student(); // declaration
        s2.name = "Rachna";
        s2.rno = sc.nextInt();
        s2.cgpa = 8.3;

        Student s3 = new Student(); // declaration
        s3.name = "Rahul";
        s3.rno = 43;
        s3.cgpa = 7.8;

        Student s4 = new Student();
        s4.name = "Utkarsh";
        s4.rno  = 22;
        s4.cgpa = 5.4;

        System.out.println(s1.name + " " +s1.cgpa + " " +s1.rno);
        s1.cgpa = 8.1; // update cgpa
        System.out.println(s1.cgpa);

        // if I want then take A input from user(Using Scanner)
        System.out.println("Roll number of s2 is: "+ s2.rno);

        s1.print();
        s2.print();
        s3.print();
        s4.print();





    }
}
