package Lesson2.Task24;

import java.util.ArrayList;

class PalindromeSubstringsDemo {
    public static void main(String[] args) {
        String text = "bob has a radar plane";
        PalindromeSubstrings palindromeSubstrings=new PalindromeSubstrings();
        // get palindromes
        ArrayList<String> palindrome = palindromeSubstrings.getPalindrome(text);
        // replace palindromes
        String modifiedText = palindromeSubstrings.replacePalindrome(palindrome, text);
        // print out
        System.out.println(modifiedText);

    }
}