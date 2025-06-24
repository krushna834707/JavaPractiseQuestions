package PractiseQue;

import java.util.Scanner;

public class breakUse {
    public static void main(String[] args) {

        //input from user until it type exit to exit
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter command:");
            String input = sc.nextLine();
            if(input.equals("exit")){
                break;
            }
        }
    }
}
