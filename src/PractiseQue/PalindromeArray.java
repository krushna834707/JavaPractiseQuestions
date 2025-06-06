package PractiseQue;

import java.util.Scanner;

public class PalindromeArray {
    public static void main(String[] args) {

        //check weather array is palindrome or not
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");

        for(int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int[] newArr = new int[arr.length];
        for(int i = arr.length-1;i>=0;i--){
            newArr[i] = arr[arr.length - 1 - i];
        }


        for(int i = 0;i<newArr.length;i++){
            System.out.println(newArr[i]);
        }

        boolean isPalindrome = true;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=newArr[i]){
                 isPalindrome= false;
            }
        }

        if (isPalindrome){
            System.out.println("The array is palindrome");
        }else{
            System.out.println("The array is not palindrome");
        }
    }
}
