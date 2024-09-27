import java.util.*;
public class strings {
    public static void main(String[] args) {
        // String name = "Tony"; //declaration
        // taking input
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        String firstName = "Tony"; //concatenation
               String secondName = "Stark";
               String fullName = firstName + " " + secondName;
               System.out.println(fullName.length());//print length of a string
               for(int i = 0;i<fullName.length();i++){
                System.out.println(fullName.charAt(i));
               }
    }
}
