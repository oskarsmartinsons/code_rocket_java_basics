/*Task 5: Write a Java program to compute body mass index (BMI).
        Test Data
        Input weight in pounds: 452
        Input height in inches: 72
        Expected Output:
        Body Mass Index is 61.30159143458721*/
package Lesson1;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Task5.calculateMassIndex();
    }
    static void calculateMassIndex() {
        try {
            Scanner inputWeight=new Scanner(System.in);
            Scanner inputHeight=new Scanner(System.in);
            System.out.println("Input weight in pounds: ");
            float weight = inputWeight.nextFloat();
            System.out.println("Input height in inches: ");
            float height = inputHeight.nextFloat();
            float bmi = (703*weight/(height*height));
            System.out.println("Body Mass Index is "  + bmi);
        }
        catch (Exception e) {
            System.out.println("Please input number!");
        }
    }
}
