package DSA.ArrayConcepts;

public class reverseString {
    public static void main(String[] args) {

        String[] str = {"h","e","l","l","o"};
        reverse(str);
        for(String s :str){
            System.out.print(s+" ");
        }


    }
    public static void reverse(String[] str){

         int a  = str.length;
         int left =0;
         int right =a-1;
         while(left<right){
             String temp = str[left];
             str[left]= str[right];
             str[right]= temp;

             left++;
             right--;
         }

    }
}
