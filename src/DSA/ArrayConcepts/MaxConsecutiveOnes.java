package DSA.ArrayConcepts;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {

        int[] nums={0,1,1,0,0,1,1,1,0,0,1,1,1,1,1};

        MaxConsecutiveOnes obj=new MaxConsecutiveOnes();

        int val = obj.findMaxConsecutiveOnes(nums);
        System.out.println("Max consecutive ones in the array is:"+val);
;
    }
    public static int findMaxConsecutiveOnes(int[] nums){
        int max = 0;
        int count=0;

        for (int num :nums){
            if(num==1){
                count++;

                if(max<count){
                    max=count;
                }
            }else{
                count=0;
            }

        }

        return max;


    }
}
