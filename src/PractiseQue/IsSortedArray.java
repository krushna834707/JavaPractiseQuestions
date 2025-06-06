package PractiseQue;

import java.util.Scanner;

public class IsSortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to sorting array checkpost.");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        boolean isInc = isIncreasing(arr);
        boolean isDec = isDecreasing(arr);
        if(isInc || isDec){
            System.out.println("Sorted array");
        }else {
            System.out.println("Not sorted");
        }


    }

    public static boolean isDecreasing(int[] numArr){

        for(int i = 0;i<numArr.length-1;i++){
            if (numArr[i]>numArr[i+1]){
                return false;
            }
        }
        return true;
    }

    public static boolean isIncreasing(int[] numArr){
        for(int i = 0;i<numArr.length-1;i++){
            if (numArr[i]<numArr[i+1]){
                return false;
            }
        }
        return true;
    }

}
