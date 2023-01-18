package Lesson2.Task25;

class SubStringReplacerDemo {
    public static void main(String[] args) {
        String sentence = "A batman with bat";
        String oldString = "bat";
        String newString = "snow";
        SubStringReplacer subStringReplacer = new SubStringReplacer();
        // replace
        String modifiedSentence = subStringReplacer.replaceSubstring(oldString,newString,sentence);
        //print out
        System.out.println(sentence);
        System.out.println(modifiedSentence);
    }
}