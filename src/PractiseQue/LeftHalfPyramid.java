package PractiseQue;

public class LeftHalfPyramid {
    public static void main(String[] args){
        //Left Half Pyramid
        for (int i = 1; i <= 5; i++) {
            // Print stars only
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(); // Move to the next line
        }
    }
}
