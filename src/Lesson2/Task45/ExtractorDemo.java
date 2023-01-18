package Lesson2.Task45;

class ExtractorDemo {
    public static void main(String[] args) {
        int test = UserInput.inputInteger();
        Extractor extractor = new Extractor();
        System.out.println("Extract the first digit from the said integer: "+extractor.getFirstDigit(test));
    }
}
