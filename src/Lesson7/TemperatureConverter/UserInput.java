package Lesson7.TemperatureConverter;

import java.util.HashMap;
import java.util.Scanner;

public class UserInput {
    Temperature input () {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter unit FROM you want to convert:  C,K or F: ");
        String inputUnitFrom = input.next();

        System.out.println("Enter temperature: ");
        double inputTemp = input.nextDouble();

        System.out.println("Enter unit TO you want to convert:  C,K or F: ");
        String inputUnitTo = input.next();

        return new Temperature(inputTemp,inputUnitFrom.charAt(0), inputUnitTo.charAt(0));
    }
}
