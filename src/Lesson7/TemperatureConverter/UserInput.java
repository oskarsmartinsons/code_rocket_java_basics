package Lesson7.TemperatureConverter;

import java.util.Scanner;

public class UserInput {
    TemperatureRequest inputRequest() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter unit FROM you want to convert:  C,K or F: ");
        String inputUnitFrom = input.next();
        System.out.println("Enter temperature: ");
        double inputTemp = input.nextDouble();
        System.out.println("Enter unit TO you want to convert:  C,K or F: ");
        String inputUnitTo = input.next();

        return new TemperatureRequest(inputTemp,inputUnitFrom.charAt(0), inputUnitTo.charAt(0));
    }

    int inputActionNumber() {
        System.out.println("Please enter action number: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    FormulaDetails inputFormulaDetails() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter unit FROM you want to convert:  C,K or F: ");
        String inputUnitFrom = input.next();
        System.out.println("Enter unit TO you want to convert:  C,K or F: ");
        String inputUnitTo = input.next();

        return new FormulaDetails(inputUnitFrom.charAt(0), inputUnitTo.charAt(0));
    }

    VerificationDetails inputVerificationDetails() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter unit FROM you want to verify:  C,K or F: ");
        String inputUnitFrom = input.next();
        System.out.println("Enter temperature FROM (in " + inputUnitFrom +"):");
        double inputTempFrom = input.nextDouble();
        System.out.println("Enter unit you wish TO verify (" + inputUnitFrom + "->?) :  C,K or F: ");
        String inputUnitTo = input.next();
        System.out.println("Enter converted temperature TO verify (in " + inputUnitTo +"): ");
        double inputTempTo = input.nextDouble();

        return new VerificationDetails(inputUnitFrom.charAt(0), inputTempFrom,
                                         inputUnitTo.charAt(0), inputTempTo);
    }
}
