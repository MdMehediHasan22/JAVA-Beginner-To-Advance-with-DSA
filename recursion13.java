public class recursion13 {
    public static void subsecuences(String str,int idx,String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        subsecuences(str, idx+1, newString+currChar);
        subsecuences(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        subsecuences(str, 0, "");
    }
    
}
