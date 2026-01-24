package OOPsJAVA;
public class Classes  {

    //creating a new datatype
    public static void main(String[] args) {
        class Student {
            String name;
            int roll_no;
            double percent;
        }
        Student s1 = new Student();
        s1.name = "Siddharth";
        s1.roll_no = 54;
        s1.percent = 95.4;
        System.out.println(s1.name);
        //updation
        s1.name = "Sumit";
        System.out.println(s1.name);

        Student s2 = new Student();
        s2.name = "Satyam";
        s2.roll_no = 45;
        s2.percent = 89.1;
        System.out.println(s2.name);
        System.out.println(s2.roll_no);
        System.out.println(s2.percent);
    }
}