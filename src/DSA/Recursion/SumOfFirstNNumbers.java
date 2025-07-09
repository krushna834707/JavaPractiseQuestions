package DSA.Recursion;

import java.util.Scanner;

public class SumOfFirstNNumbers {
    public static void main(String[] args) {
        SumOfFirstNNumbers obj = new SumOfFirstNNumbers();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of N:");
        int n = sc.nextInt();
        System.out.println("sum of n numbers :"+  obj.SumOfNNumbers(n));


    }

    public int SumOfNNumbers(int n){
        if(n==0 || n==1){
            return n ;
        }else{
            return n+SumOfNNumbers(n-1);
        }

    }
}
