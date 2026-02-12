package CoreJava.StaticKeyWord;

public class Student {
    static String College = "IIT"; // static variable
        String name; // non static variable

public static void main(String[] args) {
    Student s1 = new Student();
    Student s2 = new Student();
    Student.College= "NIT";
    System.out.println(Student.College );
}
}
