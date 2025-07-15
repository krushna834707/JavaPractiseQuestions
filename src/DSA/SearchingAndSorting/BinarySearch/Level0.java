package DSA.SearchingAndSorting.BinarySearch;


/*
* Binary Search is an optimised way of searching compare to Linear search
*
* best case when target element is on middle of array
* worst case element not found
* or number of times it   it is formula log2nK
*
* */
public class Level0 {
    public static void main(String[] args) {
        Level0 obj = new Level0();
        int[] arr = {-10,-5,0,1,3,5,7,9,10,13,16,19};
        int index = 1;
        int ans = obj.BinarySearch(arr,index);
        System.out.println("target is on index:"+ans);;

    }
    static int BinarySearch(int[] arr,int target) {

        int start =0;
        int end = arr.length-1;

        while (start<=end){
            int mid = start+(end-start)/2; //to prevent this from int limit exceed on program if we have large numbers of data
            if(target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}

