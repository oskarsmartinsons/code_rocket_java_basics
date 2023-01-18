package Lesson2.Task21;

import java.util.ArrayList;

class WordLength {
    public void meassureWords(String text) {
        String word ="";
        // put words in a array list
        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
            if (Character.isAlphabetic(text.charAt(i))){
                word = word + text.charAt(i);
            }
            if (!Character.isAlphabetic(text.charAt(i)) || i == text.length()-1){
                words.add(word);
                word="";
            }
        }

        // get smallest and largest word
        int largest=0;
        int smallest= text.length();
        String largestWord="";
        String smallestWord="";

        for (String w:words) {
            if (w.length() > largest) {
                largestWord = w;
                largest = w.length();
            }
            if (w.length() <= smallest) {
                smallestWord = w;
                smallest = w.length();
            }
        }
        //print out
        System.out.println("Smallest word is:" + smallestWord);
        System.out.println("Largest word is: " + largestWord);
    }
}