package Lesson2.Task17_18;

class StringAnalyzerDemo {
    public static void main(String[] args) {
        StringAnalyzer stringAnalyzer = new StringAnalyzer();
        stringAnalyzer.text="Hello, have a good day";
        System.out.println("Given text: " + stringAnalyzer.text);

        // Task 17
        String results = stringAnalyzer.analyzeString();
        System.out.println("Results: " + results);

        // Task 18
        String resultWithoutConsonants = stringAnalyzer.removeConsonants();
        System.out.println("Results without consonants: " + resultWithoutConsonants);
    }
}
