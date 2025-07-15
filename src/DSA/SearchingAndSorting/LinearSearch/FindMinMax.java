package DSA.SearchingAndSorting.LinearSearch;

public class FindMinMax {
    public static void main(String[] args) {
        FindMinMax obj = new FindMinMax();
        int[] arr ={5,2,-7,10,9,49,10};


        System.out.println("Min is :"+obj.FindMin(arr));
        System.out.println("Max is:"+obj.FindMax(arr));
    }
    static int FindMin(int[] arr){
        int min =arr[0];
        for(int i=0;i< arr.length;i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
    static int FindMax(int[] arr){
        int max =arr[0];
        for(int i=0;i< arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

}
