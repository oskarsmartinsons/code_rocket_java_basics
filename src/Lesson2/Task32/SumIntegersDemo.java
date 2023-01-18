package Lesson2.Task32;

class SumIntegersDemo {
    public static void main(String[] args) {
        int testInteger = UserInput.inputInteger();
        SumIntegers sumIntegers = new SumIntegers();
        System.out.printf("Sum of integer %d digits is: %d" , testInteger, sumIntegers.sumDigits(testInteger));
    }
}
