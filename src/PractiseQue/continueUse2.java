package PractiseQue;

import java.util.Scanner;

public class continueUse2 {
    //print only even numbers using continue

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter a number:");
            int num =  sc.nextInt();

            if(num==0){
                break;
            }
            if(num%2!=0){
                continue;
            }

            System.out.println(num+" ");
        }

    }
}
