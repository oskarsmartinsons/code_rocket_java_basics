/*Task 2: Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.
        Test Data
        Input an integer between 0 and 1000: 565 Expected Output :
        The sum of all digits in 565 is 16 */
package Lesson1;
import java.util.Scanner;
public class Task2 {
        public static void main(String[] args) {
            Task2.sumDigits();
        }
    static void sumDigits() {
        try {
            Scanner input=new Scanner(System.in);
            System.out.println("Input an integer between 0 and 1000:");
            int myInteger = input.nextInt();
            int firstDigit = (myInteger / 100);
            int secondDigit = (myInteger / 10) - firstDigit*10;
            int thirdDigit = (myInteger%10);
            int sumOfDigits = firstDigit+secondDigit+thirdDigit;
            System.out.println("The sum of all digits in " + myInteger + " is " + sumOfDigits );
        }
        catch (Exception e) {
            System.out.println("Please input round number!");
        }
    }
}
