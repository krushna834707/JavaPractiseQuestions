package PractiseQue;

import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {


        int[] arr = {1,3,5};
        int[] arr2={2,4,6,8};
        int[] mergedArr = new int[arr.length+ arr2.length];
        System.out.println("Your merged array is:");
        for(int i = 0;i<mergedArr.length;i++){
            System.out.println(mergedArr[i]);
        }
    }


    public static  int[] merge(int[] a1,int[] a2){

        int newArr[] = new int[a1.length+a2.length];


        return newArr;
    }
}
