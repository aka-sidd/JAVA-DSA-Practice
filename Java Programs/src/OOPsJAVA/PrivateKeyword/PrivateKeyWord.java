package OOPsJAVA.PrivateKeyword;
class Students {
    String name;
    private int rno;
    double cgpa;
    void print(){ //getter
        System.out.println(name+" "+cgpa+" "+rno);
    }
//    public void p(){
//       print();
//    }
    int getRno(){ // getter
        return rno;
    }
    void setRno(int x){
        rno = x;
    }
}
public class PrivateKeyWord {

    public static void main(String[] args) {
        Students s1 = new Students();
        s1.print();
        s1.cgpa = 8.9;
        s1.name = "Siddharth";
        //s1.rno = 45;
        s1.setRno(45);
        s1.print();
    }
}
