package DSA.SearchingAndSorting.BinarySearch;

public class ceilingOfaNumber {
    public static void main(String[] args) {
          int[] arr = {-10,-5,0,1,3,5,7,9,10,13,16,19};
          int target=11;

    }
    static int ceilingNumber(int[] arr , int target){

        int start =0;
        int end = arr.length-1;

        while(start<=end){

            int mid = start+(end-start)/2;


            if(target<arr[mid]){
             end = mid-1;

            }else if (target>arr[mid]) {
                start = mid+1;
            }else{
                return  mid;
            }
        }
        return -1;
    }
}
