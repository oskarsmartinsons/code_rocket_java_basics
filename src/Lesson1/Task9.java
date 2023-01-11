/*Task 9: Write a Java program to break an integer into a sequence of individual digits.
        Test Data
        Input six non-negative digits: 123456 Expected Output :
        1 23456*/
package Lesson1;
import java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Task9.breakInteger();
    }
    static void breakInteger() {
        try {
            //get inputs
            Scanner inputNumber=new Scanner(System.in);
            System.out.println("Input six non-negative digits: ");
            int myNumber = inputNumber.nextInt();
            // convert to string
            String myStringNumber = Integer.toString(myNumber);
            // convert from string to string with spaces between integers
            String output="";
            for (int i = 0; i < myStringNumber.length(); i++) {
                String value;
                value = String.valueOf(myStringNumber.charAt(i));
                output = output + value +" ";
            }
            System.out.println("String with spaces: "  + output);
        }
        catch (Exception e) {
            System.out.println("Please input correct number!");
        }
    }
}
