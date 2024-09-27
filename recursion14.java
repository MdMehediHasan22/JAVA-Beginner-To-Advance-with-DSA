import java.util.HashSet;
public class recursion14 {
    public static void subsecuences(String str,int idx,String newString,HashSet<String> set){
        if(idx==str.length()){
            if(set.contains(newString)){
                return;
            }else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        subsecuences(str, idx+1, newString+currChar, set);
        subsecuences(str, idx+1, newString, set);
    }     public static void main(String[] args) {
        String str ="aaa";
        HashSet<String>set=new HashSet<>();
        subsecuences(str, 0, "", set);
    }
}
