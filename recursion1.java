import java.util.*;

public class recursion1 {
    public static void printNum(int n){
        if(n==0){
            
            return;
        }
        System.out.print(n);
        printNum(n-1);
    }
    public static void main(String[] args) {
        int n=5;
     printNum(n);
    }
}
