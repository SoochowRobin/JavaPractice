import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ToArraysAsListPractice {

    /*
    How to reverse a string with multiple space
    1. use string.trim() method to delete leading space
    2. use split("") method to get a string array
    3. use Arrays.asList() method to convert an array to list because you need to use Collection.reverse() method
    4. use String.join() method to concatenate the words
     */

    public static String reverseString(String s){
        // trim the string
        s = s.trim();
        // convert the split words into List
        List<String> wordList = Arrays.asList(s.split("\\s+")); //  regrex: multiple space
        Collections.reverse(wordList);
        return String.join(" ", wordList);
    }

    public static void main(String[] args) {
        String testString = "Hello    World!     ";
        System.out.println(reverseString(testString));
    }

}
