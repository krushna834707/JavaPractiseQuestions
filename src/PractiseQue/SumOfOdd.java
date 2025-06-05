package PractiseQue;

import java.util.Scanner;

public class SumOfOdd {
    public static void main(String[] args) {
        //sum of all odd numbers
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        for (int i =1;i<=n;i++){
            if (i%2!=0){
                sum+=i;
            }
        }

        System.out.println("sum of odd number from 1 to n numbers are :"+sum);
    }
}
