package PractiseQue;

public class Array4 {
    public static void main(String[] args) {
        // Sorting in array
        int[] arr = {10,20,30,11,23,45};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.println("Elements after sorting");
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
    }
}
