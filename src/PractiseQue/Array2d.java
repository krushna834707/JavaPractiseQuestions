package PractiseQue;

import java.util.Scanner;

public class Array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row size:");
        int row = sc.nextInt();
        System.out.println("Enter column size:");
        int column = sc.nextInt();

        int[][]  arr = new int[row][column];

        for (int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.println("Enter elements of array at "+i+" "+j +":");
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("printing 2d array elements:");
        for (int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println( );
        }
    }

}
