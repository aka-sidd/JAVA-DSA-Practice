package OOPsJAVA.Methods;

public class ImplementsMethod {
    public void PlayMusic(){
        System.out.println("Music Playing");
    }
    public String GivePen(int cost){
        if(cost>=10)
        return "Pen";
        else
          return "Nothing";
    }

    public static void main(String[] args) {
        ImplementsMethod obj = new ImplementsMethod();
        String str = obj.GivePen(10);
        obj.PlayMusic();
        System.out.println(str);
    }
}
