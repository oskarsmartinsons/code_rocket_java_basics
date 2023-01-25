package Lesson6.WordCounter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {

    public List<String> splitIntoWords(String text) {
        String correctedText = text.replaceAll("[^a-zA-Z]", " ");
        String[] words = correctedText.split("\\s+");
        return Arrays.asList(words);
    }

    public Map<String, Integer> wordsCount(List<String> words) {
        HashMap<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) {
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