package Lesson2.Task42;

class IntegerHelper {
    void countSpecificDigit(int myInteger, int digit) {
        int counter=0;
        String myString = String.valueOf(myInteger);
        for (int i = 0; i < myString.length(); i++) {
            if(Character.getNumericValue(myString.charAt(i))==digit){counter++;}
        }
        System.out.println("In integer " + myInteger + " have " + counter + " digits of " +digit);
    }
}
