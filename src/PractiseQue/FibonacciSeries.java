package PractiseQue;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a series of numbers   : ");
        int num = sc.nextInt();
        int a=0;
        int b=1;

        for (int i =1;i<=num;i++){
            System.out.println(" "+a);
            int c = a+b;
            a=b;
            b=c;


        }
    }
}
