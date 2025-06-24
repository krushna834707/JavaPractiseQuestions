package PractiseQue;

import java.util.Scanner;

public class forEach2 {
    public static void main(String[] args) {
        //occurences of specific element in an array using Array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of array :");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("elements of array:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("Enter element you want to know occurences:");
        int input = sc.nextInt();
        int count=0;

        for(int a : arr){
            if(a==input){
                count++;
            }
        }
        System.out.println(input+" : "+count+" times");
    }
}
