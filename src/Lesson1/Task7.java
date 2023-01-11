/*Write a Java program that reads a number and display the square, cube, and fourth power.
        Expected Output: Square: .2f
        Cube: .2f
        Fourth power: 50625.00*/
package Lesson1;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Task7.calculate();
    }
    static void calculate() {
        try {
            //get inputs
            Scanner inputNumber=new Scanner(System.in);
            System.out.println("Input number: ");
            float myNumber = inputNumber.nextFloat();
            double square = Math.pow(myNumber,2);
            double cube = Math.pow(myNumber,3);
            double fourth =  Math.pow(myNumber,4);
            // print out
            System.out.println("Square: "  + square);
            System.out.println("Cube: "  + cube);
            System.out.println("Fourth power: "  + fourth);
        }
        catch (Exception e) {
            System.out.println("Please input correct numbers!");
        }
    }
}
