import java.util.ArrayList;
import java.util.Collections;

public class Reversed {
    public String reversedString(String strToReverse) {
        if (strToReverse == null || strToReverse.isEmpty()) {
            return "";
        }

        char[] arrayOfChars = strToReverse.toCharArray();
        ArrayList<Integer> charsIndexes = new ArrayList<>();
        ArrayList<Character> singleLetters = new ArrayList<>();

        // find all indexes of non-digits
        for (int i = 0; i < arrayOfChars.length; i++) {
            char ch = arrayOfChars[i];
            if(!Character.isDigit(ch)) {
                charsIndexes.add(i);
                singleLetters.add(ch);
            }
        }
        
        Collections.reverse(singleLetters);

        // put singleLetters chars back to its indexes
        for (int i = 0; i < charsIndexes.size(); i++) {
            // get the char index
            int index = charsIndexes.get(i);
            // put singleLetter chars back 
            // to its original places in the arrayOfChars
            arrayOfChars[index] = singleLetters.get(i);
        }

        return new String(arrayOfChars);    
    }
}