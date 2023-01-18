package Lesson2.Task27_28;

import java.util.*;

class Calculator {
    List<Double> enterNumbers() {
        List<Double> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Scanner input = new Scanner(System.in);
            System.out.printf("Enter number %d : ", (i + 1));
            double number = input.nextDouble();
            list.add(number);
        }
        return new ArrayList<>(list);
    }

    double returnMin(List<Double> numbersList) {
        return Collections.min(numbersList);
    }

    double returnAvg(List<Double> numbersList) {
        double sum=0;
        for (double n:numbersList) sum = sum + n;
        return sum/(numbersList.size());
    }
}