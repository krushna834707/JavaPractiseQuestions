package PractiseQue;

public class Patterns {
    public static void main(String[] args) {
        //solidRectangle()
        //hollowRectangle();
        //halfPyramid();
        //invertedHalfPyramid();
        //halfPyramidWithNumbers();
       // invertedHalfPyramidWithNumbers();
        floydTriangle();
    }
    public static void solidRectangle(){
        for (int i=0;i<4;i++){
            for(int j =0;j<=4;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void hollowRectangle(){
        for (int i=1;i<=4;i++){
           for (int j=1;j<=5;j++){
               if (i==1||j==1||i==4||j==5){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }

           }
            System.out.println();
        }
    }

    public static void halfPyramid(){
        for (int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void invertedHalfPyramid(){
        int n=4;
        int m=4;

        for(int i=n;i>=1;--i){
            for(int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void invertedHalfPyramid2(){

    }

    public static void halfPyramidWithNumbers(){
        for (int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+j);
            }
            System.out.println(" ");
        }
    }
    public static void invertedHalfPyramidWithNumbers(){
        for (int i =5; i >= 1; i--) {
            // Inner loop for numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();  // Move to next line
        }
//        for (int i=1;i<=5;i++){
//          for(int j=1;j<=5-i+1;j++){
//              System.out.print(" "+j);
//          }
//            System.out.println();
//        }
    }

    public static void floydTriangle(){
        int number=1;
        for (int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("  "+number);
                number++;
            }
            System.out.println();
            

        }
    }
}