public class recursion18 {
    public static int placeTiles(int n,int m){
        //basecase
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }

        //vertically
        int verPlacements = placeTiles(n-m, m);
        //horigontaly
        int horiPlacements = placeTiles(n-1, m);
        return verPlacements+horiPlacements;
    }
    public static void main(String[] args) {
        int n=4,m=2;
        System.out.println(placeTiles(n, m));
    }
}
