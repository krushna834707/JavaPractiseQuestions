package DSA.ArrayConcepts;

import java.util.Scanner;

public class removeElement {
    public static void main(String[] args) {

        //[0,1,2,2,3,0,4,2] output : [0,1,4,0,3]

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
            System.out.print(nums[i]+" ");
        }


        System.out.println("Enter element to be removed:");
        int val = sc.nextInt();


        removeElement rm = new removeElement();
        int newNums = rm.removeElements(nums,val);

        System.out.println("Array After Removing element");

        for(int i = 0; i<newNums; i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static int removeElements(int[]  nums, int val){
        int j = 0;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] != val){
                nums[j] = nums[i];
                j++;

            }
        }

        return j;

    }
}
