package rocks.zipcode.assessment2.fundamentals;

import java.util.ArrayList;
import java.util.List;

public class BasicStringUtils {
    /**
     * @param string1 - Base string to be added to
     * @param string2 - String to add to `string1`
     * @return concatenation of `string1` and `string2`
     */
    public static String concatentate(String string1, String string2) {
        return string1 + string2;
    }

    /**
     * @param string1 - String to be reversed
     * @return an identical string with characters in reverse order
     */
    public static String reverse(String string1) {
        String reversedString = "";
        char[] charArray = string1.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--){
            reversedString += charArray[i];
        }
        return reversedString;
    }

    /**
     * @param string1 - first string to be reversed
     * @param string2 - second string to be reversed
     * @return concatenation of the reverse of `string1` and reverse of `string2`
     */
    public static String reverseThenConcatenate(String string1, String string2) {
        String reversedString1 = reverse(string1);
        String reversedString2 = reverse(string2);
        return reversedString1 + reversedString2;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - Characters that should be removed from `string`
     * @return `string` with `charactersToRemove` removed
     */
    public static String removeCharacters(String string, String charactersToRemove) {
        String result = "";
        char[] stringToChars = string.toCharArray();
        char[] charsToRemove = charactersToRemove.toCharArray();
        List<Character> listOfCharsToRemove = new ArrayList<>();
        for (int i = 0; i < charsToRemove.length; i++){
            listOfCharsToRemove.add(charsToRemove[i]);
        }
        for (int i = 0; i < stringToChars.length; i++){
              if (!listOfCharsToRemove.contains(stringToChars[i])){
                  result += stringToChars[i];
              }
        }
        return result;
    }

    /**
     * @param string - the string to be manipulated
     * @param charactersToRemove - characters to be removed from the string
     * @return reverse of `string` with `charactersToRemove` removed
     */
    public static String removeCharactersThenReverse(String string, String charactersToRemove) {
        String removedCharacters = removeCharacters(string, charactersToRemove);
        return reverse(removedCharacters);
    }
}
