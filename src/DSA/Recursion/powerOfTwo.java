package DSA.Recursion;

import java.util.Scanner;

public class powerOfTwo {
    public static void main(String[] args) {

        powerOfTwo obj = new powerOfTwo();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter number:");
        int num = sc.nextInt();

        if (power(num)) {
            System.out.println(num + " is a power of 2.");
        } else {
            System.out.println(num + " is NOT a power of 2.");
        }

    }
    public static  boolean power(int n){
        if(n==1){
            return true;
        }
        if(n==0 || n%2!=0){
            return  false;

        }
        return power(n/2);
    }
}
