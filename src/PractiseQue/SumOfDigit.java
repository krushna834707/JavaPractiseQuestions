package PractiseQue;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a digit number:");
        int digit =sc.nextInt();
        int rem;
        int sod=0;


//
        while(digit!=0){
            rem = digit%10; //
            digit=digit/10;
            sod=sod+rem;
        }

        System.out.println("sum of digit:"+sod);
    }
}
