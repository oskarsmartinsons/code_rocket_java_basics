package Lesson2.Task12_15;

class StringCheck {
    public void checkLength (String myString) {
        int length=myString.length();
        System.out.printf("Length of the string '%s' is %d %n",myString,length);
    }

    public void checkLetter (String myString, String letter) {
        boolean isPresent=myString.contains(letter);
        System.out.printf("Is letter '%s' present in the string '%s?': %s %n",letter,myString,isPresent);
    }

    public void checkWord (String myString, String letter) {
        boolean isPresent=myString.contains(letter);
        System.out.printf("Is word '%s' present in the text '%s?': %s %n",letter,myString,isPresent);
    }
    public void checkOccurance (String myString, String symbol) {
        int firstIndexOf=myString.indexOf(symbol);
        int lastIndexOf=myString.lastIndexOf(symbol);
        System.out.printf("First index of letter '%s' in the text '%s' is at position %d %n",symbol, myString,firstIndexOf);
        System.out.printf("Last index of letter '%s' in the text '%s' is at position %d %n",symbol, myString,lastIndexOf);
    }


}
