package PractiseQue;

import java.util.Scanner;

public class Que72 {
    public static void main(String[] args) {
       Que72 obj = new  Que72();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of radious:");
        int r = sc.nextInt();

        obj.circumferenceOfCircle(r);

    }

    public void circumferenceOfCircle(int r){
        double result = 2 * Math.PI * r;
        System.out.println("Circumference of Circle is : "+result);
    }
}
