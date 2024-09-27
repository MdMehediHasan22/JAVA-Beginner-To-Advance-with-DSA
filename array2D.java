import java.util.*;

public class array2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]number = new int[2][3];
        int [][]A = new int[2][3];
        for(int i=0;i<number.length;i++){
            for(int j = 0;j<number[i].length;j++){
                System.out.print("Enter number for [" + i + "][" + j + "]: ");
                number[i][j] = sc.nextInt(); // Reading input
            
        }
    }
    //printing the 2D Array
    for(int i=0;i<number.length;i++){
        for(int j = 0;j<number[i].length;j++){
            System.out.print(" "+number[i][j]);
        }
        System.out.println();
    }
    for(int i=0;i<A.length;i++){
        for(int j = 0;j<A[i].length;j++){
            System.out.print("Enter number for [" + i + "][" + j + "]: ");
           A[i][j] = sc.nextInt(); // Reading input
        
    }
    }
    //printing the 2D Array
    for(int i=0;i<A.length;i++){
    for(int j = 0;j<A[i].length;j++){
        System.out.print(" "+A[i][j]);
    }
    System.out.println();
    }
    //result of addition

   int [][]result = new int[2][3];
   for(int i=0;i<result.length;i++){
    for(int j = 0;j<result[i].length;j++){
       result[i][j] = number[i][j]+A[i][j];
    
}
}
//printing the 2D Array
for(int i=0;i<result.length;i++){
for(int j = 0;j<result[i].length;j++){
    
    System.out.print(" "+result[i][j]);
}
System.out.println();
}

}
}




