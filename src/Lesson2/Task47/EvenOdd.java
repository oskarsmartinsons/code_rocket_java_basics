package Lesson2.Task47;

class EvenOdd {
    boolean isEven (int myInteger) {
        String myString = String.valueOf(myInteger);
        for (int i = 0; i < myString.length(); i++) {
            if(Character.getNumericValue(myString.charAt(i))%2!=0) {return false;}
        }
        return true;
    }
}
