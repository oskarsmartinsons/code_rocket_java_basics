package Lesson2.Task33;

import java.util.Scanner;

class UserInput {
    static double inputInvestment() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the investment amount: ");
        return input.nextDouble();
    }
    static double inputROI() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the rate of interest:  ");
        return input.nextDouble();
    }
    static int inputYears() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number of years:  ");
        return input.nextInt();
    }
}
