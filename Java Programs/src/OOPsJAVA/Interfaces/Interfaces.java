package OOPsJAVA.Interfaces;
interface Animal {
    public void run();

}
class Tigers implements Animal {
    public void run(){
        System.out.println("Tiger Runs!!");
    }
}
class Lion implements Animal {
    public void run(){
        System.out.println("Lion Runs");
    }
}
public class Interfaces {
    public static void main(String[] args) {
       Animal obj = new Tigers();
       Animal obj1 = new Lion();
       obj.run();
       obj1.run();
    }
}
