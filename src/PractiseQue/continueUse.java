package PractiseQue;

import java.util.Scanner;

//create a program using continue to sum of all positive number by user skip any negative numbers
public class continueUse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float sum=0;
        while(true){
            System.out.println("Enter a number");
            int num = sc.nextInt();
            if(num<0) {
                continue;
            }
            if(num==0){
                break;
            }
            sum+=num;
        }
        System.out.println("Sum of all positive numbers: " + sum);
    }
}
