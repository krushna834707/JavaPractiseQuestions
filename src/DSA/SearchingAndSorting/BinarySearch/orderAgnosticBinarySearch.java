package DSA.SearchingAndSorting.BinarySearch;

public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
      //  int[] arr = {-10,-5,0,1,3,5,7,9,10,13,16,19};
        int[] arr = {99,80,66,45,32,28,16,9,4,0,-10};
        int index = 16;

        orderAgnosticBinarySearch obj = new orderAgnosticBinarySearch();
        int ans = obj.orderAgnosticBinary(arr,index);

        System.out.println("Index number is:"+ans);

    }
    static  int orderAgnosticBinary(int[] arr,int target){

        int start = 0;
        int end = arr.length-1;

        boolean isAsc = arr[start]<arr[end];

        while(start<=end){

            int mid = start+(end-start)/2; // finding a middle value

                if(target == arr[mid]){
                    return mid;
                }
                if(isAsc){
                    if(target<arr[mid]){
                        end = mid-1;

                    }else{
                        start=mid+1;
                    }
                }else{
                    if(target>arr[mid]){
                        end = mid-1;
                    }else{
                        start=mid+1;
                    }
                }
        }

        return -1;
    }
}
