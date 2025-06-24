package PractiseQue;

public class forEach {
    public static void main(String[] args) {

        //find a maximum from and array
        int[] arr = {10,20,30,40,12,23};
        int max = arr[0];
        for(int a : arr){
            if (max<a){
                max=a;
            }
       }
        System.out.println("maximum in array :"+max);

    }
}
