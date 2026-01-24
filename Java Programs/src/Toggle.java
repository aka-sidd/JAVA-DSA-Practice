import java.util.*;
public class Toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);
        //toggle
        for(int i = 0;i<str.length();i++){
            //P-p
            //check alphabet - small or capital
            boolean flag = true; //true - capital
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if(ascii>=97) flag = false; //small
            if(flag == true){ //capital
                ascii+=32;
                char dh = (char)ascii;  //a
                str.setCharAt(i,dh);
            }
            else{          //small
                ascii-=32;
                char dh = (char)ascii;
                str.setCharAt(i,dh);

            }

        }
        System.out.println(str);
    }
}
