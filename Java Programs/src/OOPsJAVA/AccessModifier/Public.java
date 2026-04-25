package OOPsJAVA.AccessModifier;
class Siddharth {
   public String College_name;
    public int rno;
   public int age;
   public void print(){
       System.out.println(College_name);
       System.out.println(rno);
       System.out.println(age);
   }
}
public class Public {
    public static void main(String[]args){
        Siddharth s1 = new Siddharth();
        s1.College_name = "Siddharth Pandey";
        s1.age = 21;
        s1.rno = 45;
        s1.print();
    }
}
