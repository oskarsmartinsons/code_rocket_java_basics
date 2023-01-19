package Lesson3.Task6;
import java.text.DecimalFormat;

class Comparator {
    private static final DecimalFormat decimalForm = new DecimalFormat("0.000");
    void compareNumbers( float first, float second) {
        String numberOne = decimalForm.format(first);
        String numberTwo = decimalForm.format(second);
        System.out.println(numberOne);
        System.out.println(numberTwo);
        if (numberOne.equals(numberTwo)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    };
}
