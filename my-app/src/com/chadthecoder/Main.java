package com.chadthecoder;
import java.awt.*;

public class Main
{
    public static void main(String[] args)
    {
	    // write your code here
        System.out.println("Hello World");

        Car myCar = new Car(25.5, "1BC32E", Color.BLUE, true);
        Car sallyCar = new Car(13.9, "3D20BN", Color.BLACK, false);

        System.out.println("My Car's License Plate: " + myCar.licensePlate);
        System.out.println("Sally's License Plate: " + sallyCar.licensePlate);
    }
}
