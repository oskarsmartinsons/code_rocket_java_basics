package Lesson6.WordCounter;

import java.util.*;

public class WordCounterTest {
    public static void main(String[] args) {
        shouldReturnExceptionIfStringIsNUll(null); // passed
        shouldReturnEmptyIfStringIsEmpty(""); // passed
        shouldReturnEmptyIfStringIsSpace(" ");  // passed
        shouldReturnEmptyIfStringIsNonAlphabetic("1.3/4&536-7+"); // passed
        shouldReturn1KeyWithValue1IfStringIsOneWord("one");       // passed
        shouldReturn1KeyWithValue2IfStringIsOneWordTwice("one one");  // passed
        shouldReturn3KeysWithValue1IfStringIsThreeUniqueWords("one two three"); // passed
        shouldReturn1KeyWithValue1IfStringIsOneWordWithLeadingNonAlphabetChar("1.one");  // passed
        shouldReturn1KeyWithValue1IfStringIsOneWordWithTrailingNonAlphabetChar("one!");  // passed
        shouldReturn1KeyWithValue2IfStringIsOneWordTwiceDelimitedWithNonAlphabetChars("one123one");  // passed
        shouldReturn10KeysIfStringIs10UniqueWords("one two three four five six seven eight nine ten"); // passed
        shouldReturn1KeyWithValue10IfStringIs10IdenticalWords("test..test1 test,test  3test-test .test.test >test test1"); // passed
    }
    public static void shouldReturnExceptionIfStringIsNUll(String string) {
        boolean isThrown = false;
        try {
            WordCounter wordCounter = new WordCounter();
            wordCounter.splitIntoWords(string);
        } catch (IllegalArgumentException expectedException) {
            isThrown = true;
        } finally {
            if(isThrown) {
                System.out.println("shouldReturnExceptionIfStringIsNUll: SUCCESS, expected IllegalArgumentException exception and is thrown." );
            } else System.err.println("shouldReturnExceptionIfStringIsNUll: FAILED, expected IllegalArgumentException exception but is not thrown.");
        }
    }
    public static void shouldReturnEmptyIfStringIsEmpty (String string) {
        WordCounter wordCounter = new WordCounter();
        List<String> words = wordCounter.splitIntoWords(string);
        Map<String,Integer> result = wordCounter.wordsCount(words);

        if(result.isEmpty()) {
            System.out.println("shouldReturnEmptyIfStringIsEmpty: SUCCESS, expected Empty map and is '" + result + "'.");
        } else System.err.println("shouldReturnEmptyIfStringIsEmpty: FAILED, expected Empty map but is" + result + "'.");
    }
    public static void shouldReturnEmptyIfStringIsSpace (String string) {
        WordCounter wordCounter = new WordCounter();
        List<String> words = wordCounter.splitIntoWords(string);
        Map<String,Integer> result = wordCounter.wordsCount(words);

        if(result.isEmpty()) {
            System.out.println("shouldReturnEmptyIfStringIsSpace: SUCCESS, expected Empty map and is '" + result + "'.");
        } else System.err.println("shouldReturnEmptyIfStringIsSpace: FAILED, expected Empty map but is" + result + "'.");
    }
    public static void shouldReturnEmptyIfStringIsNonAlphabetic (String string) {
        WordCounter wordCounter = new WordCounter();
        List<String> words = wordCounter.splitIntoWords(string);
        Map<String,Integer> result = wordCounter.wordsCount(words);

        if(result.isEmpty()) {
            System.out.println("shouldReturnEmptyIfStringIsNonAlphabetic: SUCCESS, expected Empty map and is '" + result + "'.");
        } else System.err.println("shouldReturnEmptyIfStringIsNonAlphabetic: FAILED, expected Empty map but is" + result + "'.");
    }
    public static void shouldReturn1KeyWithValue1IfStringIsOneWord (String string) {
        WordCounter wordCounter = new WordCounter();
        List<String> words = wordCounter.splitIntoWords(string);
        Map<String,Integer> result = wordCounter.wordsCount(words);
        Map<String,Integer> expectedResult = new HashMap<>();
        expectedResult.put("one", 1);

        if(result.equals(expectedResult)){
            System.out.println("shouldReturn1KeyWithValue1IfStringIsOneWord: SUCCESS, expected " + expectedResult + " and is " + result + "'.");
        } else System.err.println("shouldReturn1KeyWithValue1IfStringIsOneWord: FAILED, expected " + expectedResult + " but is" + result + "'.");
    }
    public static void shouldReturn1KeyWithValue2IfStringIsOneWordTwice (String string) {
        WordCounter wordCounter = new WordCounter();
        List<String> words = wordCounter.splitIntoWords(string);
        Map<String,Integer> result = wordCounter.wordsCount(words);
        Map<String,Integer> expectedResult = new HashMap<>();
        expectedResult.put("one", 2);

        if(result.equals(expectedResult)){
            System.out.println("shouldReturn1KeyWithValue2IfStringIsOneWordTwice: SUCCESS, expected " + expectedResult + " and is " + result + "'.");
        } else System.err.println("shouldReturn1KeyWithValue2IfStringIsOneWordTwice: FAILED, expected " + expectedResult + " but is" + result + "'.");
    }
    public static void shouldReturn3KeysWithValue1IfStringIsThreeUniqueWords(String string) {
        WordCounter wordCounter = new WordCounter();
        List<String> words = wordCounter.splitIntoWords(string);
        Map<String,Integer> result = wordCounter.wordsCount(words);
        Map<String,Integer> expectedResult = new HashMap<>();
        expectedResult.put("one", 1);
        expectedResult.put("two", 1);
        expectedResult.put("three", 1);

        if(result.equals(expectedResult)){
            System.out.println("shouldReturn3KeysWithValue1IfStringIsThreeUniqueWords: SUCCESS, expected " + expectedResult + " and is " + result + "'.");
        } else System.err.println("shouldReturn3KeysWithValue1IfStringIsThreeUniqueWords: FAILED, expected " + expectedResult + " but is" + result + "'.");
    }
    public static void shouldReturn1KeyWithValue1IfStringIsOneWordWithLeadingNonAlphabetChar (String string) {
        WordCounter wordCounter = new WordCounter();
        List<String> words = wordCounter.splitIntoWords(string);
        Map<String,Integer> result = wordCounter.wordsCount(words);
        Map<String,Integer> expectedResult = new HashMap<>();
        expectedResult.put("one", 1);

        if(result.equals(expectedResult)){
            System.out.println("shouldReturn1KeyWithValue1IfStringIsOneWordWithLeadingNonAlphabetChar: SUCCESS, expected " + expectedResult + " and is " + result + "'.");
        } else System.err.println("shouldReturn1KeyWithValue1IfStringIsOneWordWithLeadingNonAlphabetChar: FAILED, expected " + expectedResult + " but is" + result + "'.");
    }
    public static void shouldReturn1KeyWithValue1IfStringIsOneWordWithTrailingNonAlphabetChar (String string) {
        WordCounter wordCounter = new WordCounter();
        List<String> words = wordCounter.splitIntoWords(string);
        Map<String,Integer> result = wordCounter.wordsCount(words);
        Map<String,Integer> expectedResult = new HashMap<>();
        expectedResult.put("one", 1);

        if(result.equals(expectedResult)){
            System.out.println("shouldReturn1KeyWithValue1IfStringIsOneWordWithTrailingNonAlphabetChar: SUCCESS, expected " + expectedResult + " and is " + result + "'.");
        } else System.err.println("shouldReturn1KeyWithValue1IfStringIsOneWordWithTrailingNonAlphabetChar: FAILED, expected " + expectedResult + " but is" + result + "'.");
    }
    public static void shouldReturn1KeyWithValue2IfStringIsOneWordTwiceDelimitedWithNonAlphabetChars (String string) {
        WordCounter wordCounter = new WordCounter();
        List<String> words = wordCounter.splitIntoWords(string);
        Map<String,Integer> result = wordCounter.wordsCount(words);
        Map<String,Integer> expectedResult = new HashMap<>();
        expectedResult.put("one", 2);

        if(result.equals(expectedResult)){
            System.out.println("shouldReturn1KeyWithValue2IfStringIsOneWordTwiceDelimitedWithNonAlphabetChars: SUCCESS, expected " + expectedResult + " and is " + result + "'.");
        } else System.err.println("shouldReturn1KeyWithValue2IfStringIsOneWordTwiceDelimitedWithNonAlphabetChars: FAILED, expected " + expectedResult + " but is" + result + "'.");
    }
    public static void shouldReturn10KeysIfStringIs10UniqueWords (String string) {
        WordCounter wordCounter = new WordCounter();
        List<String> words = wordCounter.splitIntoWords(string);
        Map<String,Integer> result = wordCounter.wordsCount(words);

        if(result.size()==10){
            System.out.println("shouldReturn10KeysIfStringIs10UniqueWords: SUCCESS, expected 10 key/value pairs and is " + result.size() + "'.");
        } else System.err.println("shouldReturn10KeysIfStringIs10UniqueWords: FAILED, expected 10 key/value pairs but is" + result.size() + "'.");
    }
    public static void shouldReturn1KeyWithValue10IfStringIs10IdenticalWords(String string) {
        WordCounter wordCounter = new WordCounter();
        List<String> words = wordCounter.splitIntoWords(string);
        Map<String,Integer> result = wordCounter.wordsCount(words);

        if(result.get("test")==10) {
            System.out.println("shouldReturn1KeyWithValue10IfStringIs10IdenticalWords: SUCCESS, expected 1 key with value 10 and is " + result + "'.");
        } else System.err.println("shouldReturn1KeyWithValue10IfStringIs10IdenticalWords: FAILED, expected 1 key with value 10  but is" + result + "'.");
    }
}
