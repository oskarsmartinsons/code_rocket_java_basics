package Lesson3.Task11;

class NaturalNumberSum {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        int n = userInput.inputNumber();
        int sum=0;
        System.out.println("The first " + n + " natural numbers are :");
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            sum = sum+i;
        }
        System.out.println("The Sum of Natural Number upto " + n + " terms :" + sum );
    }
}
