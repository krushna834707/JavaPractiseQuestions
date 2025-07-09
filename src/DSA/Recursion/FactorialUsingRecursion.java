package DSA.Recursion;

import java.util.Scanner;

public class FactorialUsingRecursion {
    public static void main(String[] args) {
        FactorialUsingRecursion obj = new FactorialUsingRecursion();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number for factorial");
        int n = sc.nextInt();
        System.out.println("Factorial of "+n+"is :"+obj.FactorialOFNum(n));
    }
    public static int FactorialOFNum(int n){
        if(n==0 || n==1){
            return  n;
        }else{
            return n*FactorialOFNum(n-1);
        }
    }
}
