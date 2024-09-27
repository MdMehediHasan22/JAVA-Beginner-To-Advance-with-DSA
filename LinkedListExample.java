import java.util.*;
import java.util.LinkedList;
public class LinkedListExample{
    public static void main(String[] args) {
        LinkedList<String>countryNames = new LinkedList<String>();
        countryNames.add("Bangladesh");
        countryNames.add("Afganistan");
        countryNames.add("Nepal");
        countryNames.add("Pakistan");
        countryNames.addFirst("Australia");
        countryNames.addLast("Japan");
        //countryNames.remove("Japan");
        

        System.out.println(countryNames);
        System.out.println(countryNames.getFirst());
        for(String country:countryNames){
            System.out.println(country);
        }
    }
}
