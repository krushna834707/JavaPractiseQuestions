package PractiseQue;

import java.util.Scanner;

class Car {
    String color;
    String model;

    String speed;

    public Car(String color, String model,  String speed) {
        this.color = color;
        this.model = model;

        this.speed = speed;
    }

    public String toString() {
        return color + " " + model + " " + speed;
    }

}
public class toStringUs {

    public static void main(String[] args) {
     Car swift = new Car("blue","latest","123");
        System.out.println(swift);
    }

}
