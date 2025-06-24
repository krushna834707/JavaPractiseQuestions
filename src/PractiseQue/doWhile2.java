package PractiseQue;

import java.util.Scanner;

public class doWhile2 {
    public static void main(String[] args) {
        //number guessing game

        int num = 5;
        Scanner sc = new Scanner(System.in);

        int input;
        do {
            System.out.print("Enter a number: ");
            input = sc.nextInt();
        }while(num!=input);
        System.out.println("you guessed the number...");


    }
}
