package Lesson3.Task13;

class NaturalNumbers {
    private final int number;
    public NaturalNumbers(int number) {
        this.number = number;
    }

    void displayCubeValues() {
        for (int i = 1; i <= number; i++) {
            System.out.printf("Number is : %d and cube of %d is : %.0f %n", i, i, Math.pow(i, number));
        }
    }
}
