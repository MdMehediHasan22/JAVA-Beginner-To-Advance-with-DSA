import java.util.*;
public class arraySort {
    public static void main(String[] args) {
        int []number = {10,-3,8,4,9,2,5,1};
        Arrays.sort(number);
        for(int i = 0;i<8;i++){
            System.out.println(" "+number[i]);
        }
        String[]names = {"Mehedi","atika","talha","tanvir","Milon"};
        Arrays.sort(names);
        for(int i=0;i<5;i++){
            System.out.println(" "+names[i]);
        }

    }
}
