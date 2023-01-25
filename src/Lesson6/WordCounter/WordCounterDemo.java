package Lesson6.WordCounter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounterDemo {

    public static void main(String[] args) {
        String text = "text1. text, text,, a. c. b, a,a,b";

        WordCounter wordCounter = new WordCounter();
        List<String> words = wordCounter.splitIntoWords(text);
        Map<String, Integer> wordCount = wordCounter.wordsCount(words);

        System.out.println(wordCount);
    }
}