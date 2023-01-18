package Lesson2.Task47;

class EvenOddDemo {
    public static void main(String[] args) {
        int test = UserInput.inputInteger();
        EvenOdd evenOdd = new EvenOdd();
        System.out.println("Check whether every digit of the said integer is even or not! " + evenOdd.isEven(test));
    }
}
