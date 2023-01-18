package Lesson2.Task46;

class FactorsDemo {
    public static void main(String[] args) {
        int test = UserInput.inputInteger();
        Factors factors = new Factors();
        factors.displayFactors(test);
    }
}
