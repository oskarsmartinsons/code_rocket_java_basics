package Lesson2.Task23;

import java.util.Arrays;

class Anagrams {
    String stringSorter(String word) {
        char[] charArray =word.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
    boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) return false;
        if (!word1.equals(word2)) return false;
        return true;
    }
}