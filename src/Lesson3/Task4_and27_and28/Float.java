package Lesson3.Task4_and27_and28;

class Float {
    private final float number;

    public Float(float number) {
        this.number = number;
    }

    String checkFloat() {
        String result = "";
        if (number == 0) {
            return "Zero";
        } else if (number < 0) {
            result = "Negative number";
        } else {
            result = "Positive number";
        }
        ;
        if (Math.abs(number) < 1) {
            result = "Small " + result;
        }
        if (Math.abs(number) > 1000000) {
            result = "Large " + result;
        }
        return result;
    }
}