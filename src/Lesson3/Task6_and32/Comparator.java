package Lesson3.Task6_and32;
import java.text.DecimalFormat;

class Comparator {
    private static final DecimalFormat decimalForm = new DecimalFormat("0.000");
    void compareNumbers( float first, float second) {
        String numberOne = decimalForm.format(first);
        String numberTwo = decimalForm.format(second);
        System.out.println(numberOne);
        System.out.println(numberTwo);
        if (numberOne.equals(numberTwo)) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }
    };
}
