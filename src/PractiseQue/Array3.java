package PractiseQue;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
     //program to find minimum and maximum in array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array");

        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }


        int max=arr[0];
        int min =arr[0];
        //finding maximum number from the array

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }

        System.out.println("Maximum is :"+max);
        System.out.println("Minimum is :"+min);
    }
}
