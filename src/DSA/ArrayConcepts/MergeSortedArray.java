package DSA.ArrayConcepts;

import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        int[] nums1 =  new int[size];

        System.out.println("Enter the size of array1:");
        int m = sc.nextInt();

        System.out.println("Enter the elements of array1");

        for(int i = 0; i < m; i++) {
            nums1[i] = sc.nextInt();
        }
        System.out.println();

        System.out.println("Enter the size of the array2:");
        int n = sc.nextInt();

        int[] nums2 =  new int[n];
        System.out.println();
        System.out.println("Enter the elements of array2");
        for(int i = 0; i < n; i++) {
            nums2[i] = sc.nextInt();
        }

        System.out.println();
        System.out.println("Printing array 1:");
        for(int i = 0; i < size; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();
        System.out.println("Printing array 2:");
        for(int i = 0; i < n; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
        MergeSortedArray obj = new MergeSortedArray();
        obj.mergingSortedArray(nums1,nums2,m,n);

        System.out.println();
        System.out.println("Merged Array:");
        for(int i = 0; i < size; i++) {
            System.out.print(nums1[i] + " ");
        }
    }

    public static void mergingSortedArray(int[] nums1, int[] nums2, int m, int n) {
        int idx = m+n-1;
        int i = m-1;
        int j = n-1;

        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[idx]=nums1[i];
                idx--;
                i--;
            }else{
                nums1[idx]=nums2[j];
                idx--;
                j--;

            }
        }
        while(j>=0){
            nums1[idx]=nums2[j];
            idx--;
            j--;
        }
    }

}
