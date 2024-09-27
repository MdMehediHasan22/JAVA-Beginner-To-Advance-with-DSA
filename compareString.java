import java.util.*;
public class compareString {
    public static void main(String[] args) {
        String name1 = "Aony";
        String name2 = "Tony";

        if(name1.equals(name2)){
            System.out.println("Same String");
        }else{
            System.out.println("Different String");
        }
        //Donot use == to check fopr string equality
        //Give incorrect answer here
        if(new String("Tony")== new String("Tony")){
            System.out.println("same");
        }else{
            System.out.println("Different");
        }
    }
}
