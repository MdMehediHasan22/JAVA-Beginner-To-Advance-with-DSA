import java.util.*;
public class functions {
    public static int calculateSum(int a , int b){
        int sum = a+b;
        return sum;
    }
    public static int calculateMul(int a,int b){
        
        return a*b;
    }
    public static void printFactorial(int n){
        if(n<0){
            System.out.println("Invalid");
            return; 
        }
        int fact=1;
        for(int i = 1;i<=n;i++){
            
            fact=fact*i;
            
        }
        System.out.println(fact);
       return;
    }
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        
        printFactorial(n);
        int sum = calculateSum(a, b);
        int mul = calculateMul(a, b);
        System.out.println("SUm of 2 numbers="+ sum);
        System.out.println("Multiplication of 2 numbers = "+ mul);
        
    }
}
