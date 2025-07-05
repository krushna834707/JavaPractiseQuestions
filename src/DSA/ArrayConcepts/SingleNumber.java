package DSA.ArrayConcepts;


/*
*
* Given a non-empty array of integers nums,
* every element appears twice except for one. Find that single one.
You must implement a solution with a
* linear runtime complexity and use only constant extra space.
*
*
* */


public class SingleNumber {
    public static void main(String[] args) {
        int[] nums = {1,2,1,2,4};

        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[i]==nums[j]){
                       count++;
                }
            }
            if(count==1){
                int num = nums[i];
                System.out.println("Single Distinct NUmber is :"+num);
            }
        }

    }
}
