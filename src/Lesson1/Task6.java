/*Task 6: Write a Java program to takes the user for a distance (in meters) and the time was taken
(as three numbers: hours, minutes, seconds), and display the speed, in meters per second, kilometers per hour
and miles per hour (hint: 1 mile = 1609 meters).
        Test Data
        Input distance in meters: 2500
        Input hour: 5
        Input minutes: 56
        Input seconds: 23
        Expected Output :
        Your speed in meters/second is 0.11691531 Your speed in km/h is 0.42089513
        Your speed in miles/h is 0.26158804*/
package Lesson1;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Task6.calculateSpeed();
    }
    static void calculateSpeed() {
        try {
            //get inputs
            Scanner inputDistance=new Scanner(System.in);
            Scanner inputHours=new Scanner(System.in);
            Scanner inputMinutes=new Scanner(System.in);
            Scanner inputSeconds=new Scanner(System.in);
            System.out.println("Input distance in meters: ");
            float distance = inputDistance.nextFloat();
            System.out.println("Input hours: ");
            int hours = inputHours.nextInt();
            System.out.println("Input minutes: ");
            int minutes = inputMinutes.nextInt();
            System.out.println("Input seconds: ");
            int seconds = inputSeconds.nextInt();
            //convert time to seconds
            int timeInSeconds = hours*60*60 + minutes*60 + seconds;
            // calculate speed
            float speedInMetersSeconds= distance / timeInSeconds;
            float speedInKilometersHours= (distance / timeInSeconds) * 3600 / 1000;
            float speedInMilesHours = (float) (speedInKilometersHours / 1.609);
            // print out
            System.out.print("Your speed in meters/second is "  + speedInMetersSeconds);
            System.out.println("Your speed in kilometers/hours is "  + speedInKilometersHours);
            System.out.println("Your speed in miles/hours is "  + speedInMilesHours);
        }
        catch (Exception e) {
            System.out.println("Please input correct numbers!");
        }
    }
}
