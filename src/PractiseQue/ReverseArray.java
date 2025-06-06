package PractiseQue;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {

        //Reverse an array
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Reverse array is :");

        for(int i = arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }



    }
}
