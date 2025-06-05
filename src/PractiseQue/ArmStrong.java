package PractiseQue;

import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int orig = num;
        int digits=0;
        while(orig!=0){
            digits++;
            orig=orig/10;
        }

        num=orig;
        int sum=0;
        while(num!=0){
            int digit = num%10;
            sum += Math.pow(digit,digits);
            num=num/10;
        }

        if (orig==sum){
            System.out.println("Armstrong number");
        }else{
            System.out.println("Not a Armstrong number");
        }
    }
}
