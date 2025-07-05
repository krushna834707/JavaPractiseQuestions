package DSA.ArrayConcepts;

public class FindMissingNumber {
    public static void main(String[] args) {

        int[] nums = {0,4,2,1};
        FindMissingNumber fmn=new FindMissingNumber();

        System.out.println("Missing Number is:"+fmn.MissingNumber(nums));
    }
    public static int MissingNumber(int[] nums){

        int n = nums.length;
        int formula = n*(n+1)/2;
        int expectSum=0;

        for(int i=0;i<nums.length;i++){
            expectSum+=nums[i];

        }

        return formula-expectSum;
    }
}
