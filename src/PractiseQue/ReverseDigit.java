package PractiseQue;

import java.util.Scanner;

public class ReverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int rev=0;
        int rem;
        while(num!=0){
            rem =  num%10;
            rev = rev*10+rem;
            num = num/10;
        }

        System.out.println("Reversed number: "+rev);
    }
}
