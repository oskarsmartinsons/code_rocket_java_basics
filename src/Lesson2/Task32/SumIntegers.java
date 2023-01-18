package Lesson2.Task32;

public class SumIntegers {
    int sumDigits(int myInteger) {
        int sum=0;
        String textNumber = String.valueOf(myInteger);
        for (int i = 0; i < textNumber.length(); i++) {
            int digit = Character.getNumericValue(textNumber.charAt(i));
            sum = sum + digit;
        }
        return sum;
    }
}
