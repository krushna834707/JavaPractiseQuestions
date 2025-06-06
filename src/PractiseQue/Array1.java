package PractiseQue;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
        // Sum and average of array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int term =  sc.nextInt();
        int[] arr = new int[term];

        System.out.println("Enter the elements of the array");
        for (int i = 0; i < term; i++) {
            arr[i] = sc.nextInt();
        }

        int sum=0;


        for (int i = 0; i <= arr.length-1; i++) {
            sum+=arr[i];
        }
        System.out.println("sum of array is :"+sum);
        int average=sum/arr.length;
        System.out.println("Average of array is :"+average);
    }
}
