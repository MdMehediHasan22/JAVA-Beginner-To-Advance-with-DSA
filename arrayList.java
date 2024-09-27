import java.util.*;
import java.util.Collections;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        ArrayList<Integer> number1 = new ArrayList<>();
        ArrayList<Integer> number3 = new ArrayList<>();

        System.out.println(" "+number.size());
        number.add(10);
        number.add(20);
        number.add(30);
        System.out.println(" "+number);
        
        number1.add(1);
        number1.add(2);
        number1.add(3);
        System.out.println(" "+number);
        for(int x : number){
            System.out.println(" "+x);
        }
        boolean check = number.isEmpty();
        System.out.println(check);

        boolean contain = number.contains(30);
        System.out.println(contain);

        int pos = number.indexOf(20);
        System.out.println(pos);

        number.set(1, 50);
        System.out.println(number);

        int x =number.get(2);
        System.out.println(x);
        number3.addAll(number1);
        System.out.println(number3);

        boolean result = number1.equals(number3);
        System.out.println(result);

        ArrayList<Integer> number4 = new ArrayList<>();
        number4.add(10);
        number4.add(-3);
        number4.add(6);
        number4.add(9);
        number4.add(2);
        System.out.println(number4);

        Collections.sort(number4);
        System.out.println(number4);

        Collections.sort(number4,Collections.reverseOrder());
        System.out.println(number4);

    }
}
