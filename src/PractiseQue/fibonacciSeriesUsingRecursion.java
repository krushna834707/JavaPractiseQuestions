package PractiseQue;

import java.util.Scanner;

public class fibonacciSeriesUsingRecursion {
    public static void main(String[] args) {

        //0,1,1,2,3,5,8,13

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter terms:");
        int num = sc.nextInt();
        int a=0,b=1;
        System.out.println(a);
        System.out.println(b);
        for(int i=1;i<=num-2;i++){

            int c = a+b;
            System.out.println(c);
            a=b;
            b=c;

        }

    }

}
