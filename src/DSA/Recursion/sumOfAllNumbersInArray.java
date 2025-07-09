package DSA.Recursion;

import java.util.Scanner;

public class sumOfAllNumbersInArray {
    public static void main(String[] args) {

        sumOfAllNumbersInArray obj = new sumOfAllNumbersInArray();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for (int i =0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Elements of  Array are:");
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nSum of array elements: " + obj.sumOfArrayEleUsingRecursion(arr, 0));


    }

    public int sumOfArrayEleUsingRecursion(int[] arr,int index){

        if(index==arr.length){
            return 0;
        }else{
            return arr[index]+sumOfArrayEleUsingRecursion(arr,index+1);
        }
    }
}
