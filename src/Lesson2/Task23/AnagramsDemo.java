package Lesson2.Task23;

class AnagramsDemo {
    public static void main(String[] args) {
        String word1 = "rad";
        String word2 = "dar";
        Anagrams anagrams = new Anagrams();
        String sortedWord1 = anagrams.stringSorter(word1);
        String sortedWord2 = anagrams.stringSorter(word2);

        boolean isAnagram = anagrams.isAnagram(sortedWord1,sortedWord2);
        System.out.printf("Is word '%s' and '%s' an anagram? : %b", word1, word2, isAnagram);
    }
}