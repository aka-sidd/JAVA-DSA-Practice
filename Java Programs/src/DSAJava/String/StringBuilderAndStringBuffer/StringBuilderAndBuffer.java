package DSAJava.String.StringBuilderAndStringBuffer;

public class StringBuilderAndBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Siddharth");
        sb.append(" Pandey ");
        sb.insert(10,"Engineer");
        System.out.println(sb);
    }
}
