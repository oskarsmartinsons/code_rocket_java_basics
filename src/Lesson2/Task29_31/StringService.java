package Lesson2.Task29_31;

class StringService {
    String returnMiddle (String myString) {
        if(myString.length()<3) {
            return "There are only two chars";
        }
        if(myString.length()%2!=0) {
            return "The middle character in the string: " + myString.charAt(myString.length()/2);
        } else {
            return "The middle characters in the string: " +myString.charAt(myString.length()/2-1)+myString.charAt(myString.length()/2);
        }
    }

    String countVowels(String myString){
        int vowels = 0;
        for (int i=0 ; i<myString.length(); i++){
            char myChar = myString.charAt(i);
            if (myChar == 'a' || myChar == 'e' || myChar == 'i' || myChar == 'o' || myChar == 'u' ||
                    myChar == 'A' || myChar == 'E' || myChar == 'I' || myChar == 'O' || myChar == 'U') {
                vowels++;
            }
        }
        return "Number of Vowels in the string:" + vowels;
    }
    String countWords (String myString) {
        String [] words = myString.split(" ");
        return "Number of words in the string: "+ words.length;
    }
}