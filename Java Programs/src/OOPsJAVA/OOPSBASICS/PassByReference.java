//Pass By reference
package OOPsJAVA.OOPSBASICS;
import java.util.*;
public class PassByReference {
    public static void main(String[] args) {
        Random r = new Random(4,5);
        System.out.println(r.x + ","+ r.y);
        addTen(r);
        System.out.println(r.x + ","+ r.y);
    }
    static void addTen(Random r){
        r.x = r.x+10;
        r.y = r.y + 10;
    }
}
class Random {
    int x;
    int y;
    Random(int x,int y){
        this.x = x;
        this.y = y;
    }
}

