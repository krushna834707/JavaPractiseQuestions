package DSA.ArrayConcepts;

import java.util.Scanner;

public class removeDuplicate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter elements in the array:");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("elements of array:");
        for(int i = 0; i<size; i++){
            System.out.println(nums[i]);
        }

        //let's remove duplicate from an array

        removeDuplicate obj = new  removeDuplicate();
        int newlen =  obj.removeDuplication(nums);

        System.out.println("After removing duplication elements:");
        for(int i = 0; i<newlen; i++){

            System.out.println(nums[i]);
        }
    }

    public static int removeDuplication(int[] nums){
        int n = nums.length;

        int j=1;

        if (n==1) {
            return n;
        }

        for(int i =1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;

    }
}
