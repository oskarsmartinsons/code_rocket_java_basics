package Lesson2.Task17_18;

class StringAnalyzer {
    String text;
    String newText="";
    int consonants=0;
    int vowels;
    int spaces;
    public String analyzeString (){
        for (int i=0 ; i<text.length(); i++){
            char myChar = text.charAt(i);
            int ascii = myChar;
            if (ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122 ) {
                if (myChar == 'a' || myChar == 'e' || myChar == 'i' || myChar == 'o' || myChar == 'u' ||
                        myChar == 'A' || myChar == 'E' || myChar == 'I' || myChar == 'O' || myChar == 'U') {
                    vowels++;
                } else consonants++;
            }
            if (myChar == ' '){
                spaces++;
            }
        }
        return "Vowels are " + vowels+ ", Consonants are " + consonants + ", Spaces are "+ spaces;
    }

    public String removeConsonants() {
        for (int i=0 ; i<text.length(); i++){
            char myChar = text.charAt(i);
            int ascii = myChar;
            if (ascii >= 65 && ascii <= 90 || ascii >= 97 && ascii <= 122 ) {
                if (myChar != 'a' && myChar != 'e' && myChar != 'i' && myChar != 'o' && myChar != 'u' &&
                        myChar != 'A' && myChar != 'E' && myChar != 'I' && myChar != 'O' && myChar != 'U') {
                   // newText=text.replace(myChar, ' ');
                    continue;
                }
            }
            newText = newText+myChar;
        }
        return newText;
    }
}
