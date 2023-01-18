package Lesson2.Task42;

class IntegerHelperDemo {
    public static void main(String[] args) {
        int myInteger = 123454321;
        int lookFor = 1;
        IntegerHelper integerHelper = new IntegerHelper();
        integerHelper.countSpecificDigit(myInteger,lookFor);
    }
}
