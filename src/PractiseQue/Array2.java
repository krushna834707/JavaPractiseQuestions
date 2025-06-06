package PractiseQue;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        // find number of occurences of an element

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n =  sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of the array");
        for(int i =0;i<n;i++){
            arr[i] =sc.nextInt();
        }

        System.out.println("Enter the number you want to search");
        int find = sc.nextInt();
        int count=0;
        for (int i =0;i<arr.length;i++){
            if(arr[i]==find){
                count++;
            }
        }

        System.out.println("occurence of number :"+count);
    }
}
