    package PractiseQue;

    import java.util.Scanner;

    public class Array5 {
        public static void main(String[] args) {
            //Return a new array after deleting specific element

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the size of the array:");
            int n = sc.nextInt();

            int[] arr = new int[n];
            System.out.println("Enter the elements of the array:");

            for(int i = 0;i<arr.length;i++){
                arr[i] = sc.nextInt();
            }

            System.out.println("Enter element you want to delete:");
            int delEle = sc.nextInt();
            int count=0;
            for(int value:arr){
                if(value==delEle){
                    count++;
                }
            }

            if(count == 0){
                System.out.println("Deleting element not found.");
            }

            int[]  arr2 = new int[arr.length-count];
            int j = 0;
            for(int i = 0;i<arr.length;i++){
                if(arr[i]!=delEle){
                    arr2[j]=arr[i];
                    j++;
                }
            }

            System.out.println("new array is:");
            for(int i = 0;i<arr2.length;i++){
                System.out.println(arr2[i]);
            }
        }
    }
