package Lesson2.Task44;

class MiddlePointDemo {
    public static void main(String[] args) {
        int[] integers = UserInput.inputIntegers();
        MiddlePoint middlePoint = new MiddlePoint(integers[0], integers[1], integers[2]);
        boolean isMiddlePoint = middlePoint.isMiddlePoint();
        System.out.println("Check whether the three said numbers has a midpoint! " + isMiddlePoint);
    }
}
