package Encapsulation.utils;

import Encapsulation.geometry.Circle;
import Encapsulation.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {

        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(10,10);


        double cirArea =  2 * Math.PI *(circle.getRadius());
        System.out.println("Area of circle is : "+cirArea);

        double rectArea = rectangle.getLengt() *rectangle.getWidth();
        System.out.println("Area of rectangle is : "+rectArea);
    }
}
