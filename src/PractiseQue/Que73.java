package PractiseQue;

//take an array of words and concatenate them into a single string using StringBuilder

public class Que73 {
    public static void main(String[] args) {
            String[] arr ={"banana","apple","chickoo","kiwi"};

            for(String a: arr){
                System.out.println(a);
            }

            StringBuilder sb = new StringBuilder();
            for(int i=0;i<arr.length;i++){
                sb.append(arr[i]);
                if(i!=arr.length-1){
                    sb.append(",");
                }
            }
        System.out.printf(sb+" ");
    }
}
