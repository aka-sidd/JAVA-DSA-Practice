package OOPsJAVA.Encapsulation;
class Student {
    private String name;
    private int rno;
    private int age;

    //Getters
    public String getName(){
        return name;
    }
    public int getRno(){
        return age;
    }
    public int getAge(){
        return rno;
    }
    public void set_name(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setRno(int rno){
        this.rno = rno;
    }
}
public class Encapsulation_Intro {
    public static void main(String[] args) {
        Student obj = new Student();
        //set values
        obj.set_name("Siddharth");
        obj.setRno(21);
        obj.setAge(20);
        //get values
        System.out.println(obj.getName());
        System.out.println(obj.getRno());
        System.out.println(obj.getAge());


    }
}
