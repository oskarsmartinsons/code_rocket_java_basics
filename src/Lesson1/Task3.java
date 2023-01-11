/*Task 3: Write a Java program to convert minutes into a number of years and days.
        Test Data
        Input the number of minutes: 3456789
        Expected Output :
        3456789 minutes is approximately 6 years and 210 days */
package Lesson1;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Task3.convertMinutes();
    }
    static void convertMinutes() {
        try {
            Scanner input=new Scanner(System.in);
            System.out.println("Input the number of minutes:");
            long myInteger = input.nextLong();
            long years = myInteger / 365 / 24 / 60;
            long days = (myInteger/60/24)%365;
            System.out.println(myInteger+" minutes is approximately "+years+" years and " +days+" days");
        }
        catch (Exception e) {
            System.out.println("Please input round number!");
        }
    }
}
