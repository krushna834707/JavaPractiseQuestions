package PractiseQue;

import java.util.Scanner;

public class challenge53_58 {
    public static void main(String[] args) {
           challenge53_58 p = new challenge53_58();
           //p.fiftyThree();
           //p.fiftyFour();
              //p.fiftyFive();

            //p.fiftySix();
        p.fiftySeven();
    }

    public void fiftyThree(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers.");
        int num1=sc.nextInt();
        int num2=sc.nextInt();

        int minimum = num1<num2?num1:num2;
        System.out.println(minimum+" is minimum.");

    }

    public void fiftyFour(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        String result = num%2==0?"even":"odd";
        System.out.println("Number is "+result);
    }

    public void fiftyFive(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();

        int result = num>=0?num:-num;
        System.out.println("absolute Number is "+result);
    }

    public void fiftySix(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a score:");
        int score = sc.nextInt();

        String res = (score>80)?"High":(score>50?"mdoderate":"Low");
        System.out.println("res is "+res);

    }

    public void fiftySeven(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month:");
        int month = sc.nextInt();

        switch(month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;

                default:
                    System.out.println("Invalid month");
        }
    }
}


