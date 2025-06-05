package PractiseQue;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        int orig = num;
        int sum = 0;
            int rem;
        while(num!=0){
            rem=num%10; //121/10   12/10
            sum = sum*10+rem;//1  2
            num=num/10;//12
        }

        if(orig==sum){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not Palindrome");
        }
    }
}
