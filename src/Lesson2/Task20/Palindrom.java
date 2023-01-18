package Lesson2.Task20;

public class Palindrom {
    public boolean isPalindrome (String myString) {
        String reverseString="";
        for (int i = 0; i < myString.length(); i++) {
            reverseString = myString.charAt(i)+reverseString;
        }
        return myString.equals(reverseString);
    }
}