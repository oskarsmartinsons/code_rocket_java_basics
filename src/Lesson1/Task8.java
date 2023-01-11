/*Task 8: Write a Java program that accepts two integers from the user and then prints the sum,
the difference, the product, the average, the distance (the difference between integer),
the maximum (the larger of the two integers), the minimum (smaller of the two integers).
        Test Data
        Input 1st integer: 25
        Input 2nd integer: 5
        Expected Output :
        Sum of two integers: 30 Difference of two integers: 20 Product of two integers: 125 Average of two integers: 15.00 Distance of two integers: 20 Max integer: 25
        Min integer: 5*/
package Lesson1;
import java.util.Scanner;
public class Task8 {
    public static void main(String[] args) {
        Task8.compare();
    }
    static void compare() {
        try {
            //get inputs
            Scanner inputFirst=new Scanner(System.in);
            Scanner inputSecond=new Scanner(System.in);
            System.out.println("Input 1st integer: ");
            int myFirstInteger = inputFirst.nextInt();
            System.out.println("Input 2nd integer: ");
            int mySecondInteger = inputSecond.nextInt();

            int sum = Math.addExact(myFirstInteger,mySecondInteger);
            int difference = Math.subtractExact(myFirstInteger,mySecondInteger);
            int product = Math.multiplyExact(myFirstInteger,mySecondInteger);
            float average = (myFirstInteger+mySecondInteger)/2;
            int largest = Math.max(myFirstInteger,mySecondInteger);
            int smallest = Math.min(myFirstInteger,mySecondInteger);

            // print out
            System.out.println("Sum of two integers: "  + sum);
            System.out.println("Difference of two integers: "  + difference);
            System.out.println("Product of two integers: "  + product);
            System.out.println("Average of two integers: "  + average);
            System.out.println("Distance of two integers: "  + difference);
            System.out.println("Max integer: "  + largest);
            System.out.println("Min interger "  + smallest);
        }
        catch (Exception e) {
            System.out.println("Please input correct numbers!");
        }
    }
}
