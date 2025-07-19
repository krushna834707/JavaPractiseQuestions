package DSA.SearchingAndSorting.BubbleSorting;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr ={2,1,3,5,4};

        BubbleSort obj = new BubbleSort();
        obj.Sorting(arr);
        System.out.println("Array after Bubble sort:");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }

    }
    static void Sorting(int[] arr){
        for (int i=0;i<arr.length;i++){

            boolean swapped = false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1]=temp;
                   swapped = true;
                }
            }

            if(swapped==false){
                break;
            }
        }
    }
}
