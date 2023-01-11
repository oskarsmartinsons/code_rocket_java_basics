/*Task 1: Write a Java program that reads a number in inches, converts it to meters. Note: One inch is 0.0254 meter.
        Test Data
        Input a value for inch: 1000
        Expected Output :
        1000.0 inch is 25.4 meters*/

package Lesson1;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Task1.convert();
    }
    static void convert() {
        Scanner input=new Scanner(System.in);
        System.out.println("Input a value for inch: ");
        float inches = input.nextFloat();
        float ratio = 0.0254f;
        float meters = inches*ratio;
        System.out.println("Expected Output : " + inches + " inch is " + meters + " meters");
    }
}
