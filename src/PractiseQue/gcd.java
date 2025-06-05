package PractiseQue;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number 1:");
        int num1 = sc.nextInt();
        System.out.println("enter a number 2:");
        int num2 = sc.nextInt();

        int gcd=1;

        for (int i=1;i<=num1 && i <=num2;i++){
            if(num1%i==0 && num2%i==0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
}
