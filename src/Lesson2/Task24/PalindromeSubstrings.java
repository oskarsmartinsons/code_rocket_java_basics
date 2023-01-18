package Lesson2.Task24;

import java.util.ArrayList;

class PalindromeSubstrings {
    // check if Palindrome
    public boolean isPalindrome (String subString) {
        if(subString.length()==1) {
            return false;
        }
        for(int i=0; i<(subString.length()/2); i++){
            if(subString.charAt(i) != subString.charAt(subString.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
    public ArrayList<String> getPalindrome(String text) {
        // split text into words and put in array
        String[] words = text.split(" ");
        // interate array and if palindrome, create array list
        ArrayList<String> palindromes = new ArrayList<>();
        for (String w:words) {
            if(isPalindrome(w)) {
                palindromes.add(w);
            }
        }
        return palindromes;
    }

    public String replacePalindrome(ArrayList<String> myPalindromes, String myString){
        String newString=myString;
        for (String p:myPalindromes) {
            String replace = p;
            String newValue ="";
            for (int i = 0; i < p.length(); i++) {
                newValue = newValue+"*";
            }
            newString=newString.replace(replace,newValue);
        }
        return newString;
    }
}