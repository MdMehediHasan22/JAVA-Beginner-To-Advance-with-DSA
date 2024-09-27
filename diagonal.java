import java.util.*;
public class diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] D = new int [3][3];
        int sumOfDiagonals=0;
        int sumOfUpper = 0;
        int sumOfLower = 0;
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
             D[i][j]=sc.nextInt();
            }
        }
        for(int i = 0;i<3;i++){
            for(int j = 0;j<3;j++){
             if(i==j){
                sumOfDiagonals+=D[i][j];
             }
             else if(i<j){
                sumOfUpper+=D[i][j];
             }
             else{
                sumOfLower+=D[i][j];
             }
            }
        }
        System.out.println(" "+sumOfDiagonals);
        System.out.println(" "+sumOfUpper);
        System.out.println(" "+sumOfLower);
    }
}
