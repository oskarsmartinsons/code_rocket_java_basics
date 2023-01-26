package Lesson6.WordCounter;

import java.util.*;

public class WordCounter {

    public List<String> splitIntoWords(String text) {
        if (text == null) {
            throw new IllegalArgumentException("String can not be NULL");
        }
        String correctedText = text.replaceAll("[^a-zA-Z]", " ");
        String [] words = correctedText.split("\\s+");
        return Arrays.asList(words);
    }

    public Map<String, Integer> wordsCount(List<String> words) {
        HashMap<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) {
            if(word=="") {continue;}
            if (wordsMap.containsKey(word)) {
                Integer count = wordsMap.get(word);
                count++;
                wordsMap.put(word, count);
            } else {
                wordsMap.put(word, 1);
            }
        }
        return wordsMap;
    }

}