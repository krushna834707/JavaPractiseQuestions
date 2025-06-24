package PractiseQue;

import java.util.Scanner;

public class doWhile {

    public static void main(String[] args) {

        //create a program using do while to find password checker until a valid password is entered.

        Scanner sc = new Scanner(System.in);

        String pass="krishna";
        String ps1;
        do{

            System.out.println("Enter a password.");
             ps1 = sc.nextLine();

        }while(!pass.equals(ps1));

    }
}
