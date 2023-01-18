package Lesson2.Task45;

class Extractor {
    int getFirstDigit (int myInteger) {
        String myString = String.valueOf(Math.abs(myInteger));
        return Character.getNumericValue(myString.charAt(0));
    }
}
