package OOPsJAVA;

public class SimpInheritance {
    String name;
    int age;

    public void Input() {
        System.out.println("Enter the name & age");
    }
}

 class Siddhartha extends SimpInheritance{
    public void disp(){
        name = "Siddharth"; int age = 21; int marks = 55;
        System.out.println(marks+" "+name+" "+age+" ");
    }


    public static void main(String[] args) {
        Siddhartha r = new Siddhartha();
        r.disp();
    }
}

