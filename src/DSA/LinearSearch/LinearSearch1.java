package DSA.LinearSearch;

import java.util.Scanner;

public class LinearSearch1 {
    public static void main(String[] args) {

        LinearSearch1 obj = new LinearSearch1();
        int[] arr= {1,2,3,4,5,6,7,8,9,10,3,4};
        Scanner sc = new Scanner(System.in);

        int start = 1;
        int end = 4;


        System.out.println("Enter Target element to found:");
        int target = sc.nextInt();
//        int ans = FoundArrayElement(arr,target);
//        System.out.println(ans);
        int ans= FoundArrayElement2(arr,target,start,end);
        System.out.println(ans);

    }
    //search in the array : return the index if item found else not fount return -1
    static int FoundArrayElement(int[] arr,int target){

        if(arr.length==0){
            return  -1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return arr[i];

            }
        }
        //if no target value found
        return -1;
    }


    //search for 3 in the range of index [1,4]
    static int FoundArrayElement2(int[] arr,int target,int start,int end){

        if(arr.length==0){
            return  -1;
        }
        for(int i=start;i<=end;i++){
            if(arr[i]==target){
                return arr[i];
            }
        }
        //if no target value found
        return -1;
    }

}
