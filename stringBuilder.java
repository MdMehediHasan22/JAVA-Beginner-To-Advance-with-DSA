import java.util.*;
public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));
        sb.setCharAt(0,'P');
        System.out.println(sb);
        //insert

        sb.insert(2,'n');
        System.out.println(sb);
        //delete extra 'n'

        sb.delete(2, 3);
        System.out.println(sb);

        StringBuilder sb1 =  new StringBuilder("h");
        sb1.append("e");
        sb1.append("l");
        sb1.append("l");
        sb1.append("o");
        System.out.println(sb1);
    }
}
