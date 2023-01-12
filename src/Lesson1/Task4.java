/*Task 4: Write a Java program that prints the current time in GMT.
        Test Data
        Input the time zone offset to GMT: 256 Expected Output:
        Current time is 23:40:24*/
package Lesson1;
import java.util.Date;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Task4.printGmtTime();
    }
    static void printGmtTime() {
        try {
            Scanner input=new Scanner(System.in);
            System.out.println("Input the time zone offset to GMT: ");
            long offset = input.nextLong();
            // solution using class Date and method getTime() method
            long milliSeconds = new Date().getTime();
            long inSeconds = milliSeconds / 1000;
            long inMinutes = inSeconds / 60;
            long inHours = inMinutes / 60;
            long seconds = inSeconds%60;
            long minutes = inMinutes%60;
            long hoursWithOffset = ((inHours+offset)%24);
            //print out time
            System.out.printf("Current Time is: %02d:%02d:%02d", hoursWithOffset, minutes, seconds);
        }
        catch (Exception e) {
            System.out.println("Please input round number!");
        }
    }
}
