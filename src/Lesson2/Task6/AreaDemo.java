package Lesson2.Task6;

import java.util.Arrays;
import java.util.Scanner;

public class AreaDemo {
    public static void main(String[] args) {
        double dimensions[] = inputLength();
        Area  area = new Area( dimensions[0], dimensions[1]);
        System.out.println("Area of rectangular: " + Area.returnArea(area.getLength(), area.getBreadth()));
    }

    public static double[] inputLength( ) {
         // input length
        Scanner side1 = new Scanner(System.in);
        System.out.println("Enter rectangular length: ");
        double length = side1.nextDouble();
         // input breadth
        Scanner side2 = new Scanner(System.in);
        System.out.println("Enter rectangular breadth: ");
        double breadth = side2.nextDouble();
        // create array
        double array[] = {length, breadth};
        return array;
    }
}
