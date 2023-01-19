package Lesson3.Task13_15;

class NaturalNumbers {
    private final int number;
    public NaturalNumbers(int number) {
        this.number = number;
    }

    void displayCubeValues() {
        System.out.println("========================");
        for (int i = 1; i <= number; i++) {
            System.out.printf("Number is : %d, and cube of %d is : %.0f %n", i, i, Math.pow(i, 3));
        }
    }

    void displayMultiplicaitonTable() {
        System.out.println("========================");
        System.out.printf("Multiplication Table: %n");
        for (int i = 1; i <= number; i++) {
            System.out.printf("%d x %d = %d %n", number, i, number * i);
        }
    }

    void displayOddNumbers () {
        int sum = 0;
        System.out.println("========================");
        System.out.printf("The odd numbers are: %n");
        for (int i = 1; i <= number; i++) {
            if(i%2!=0) {
                System.out.println(i);
                sum = sum + i;
            }
        }
        System.out.printf("The Sum of odd Natural Number upto %d terms is: %d", number, sum);
    }
}
