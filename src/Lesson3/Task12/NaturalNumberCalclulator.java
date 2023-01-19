package Lesson3.Task12;

class NaturalNumberCalclulator {
    private final int[] array;
    public NaturalNumberCalclulator(int[] array) {
        this.array = array;
    }
    int sumNumbers () {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = array[i] + sum;
        }
        return sum;
    }
    float avg() {
        return ((float) sumNumbers()) / array.length;
    }
}
