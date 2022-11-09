import java.util.Locale;

public class StringPractice {

    /*
    This class is used to practice some basic operation for String class

    String is an object class in Java, some basic operations like .length()

    String variable is a collection of characters surrounded by double quotes.
     */

    public static void main(String[] args) {
        // create a string object
        String string = "abcdefg";

        // get string length
        int length = string.length();
        System.out.println("The length of the string is " + length);

        // convert it to uppercase
        String upperString = string.toUpperCase();
        System.out.println("The uppercase is " + upperString);

        // convert it to lowercase
        String lowerString = upperString.toLowerCase();
        System.out.println("The lowercase is " + lowerString);

        // find a character(word string) position in a string
        // it will return -1
        int positionIndex = lowerString.indexOf("i");
        System.out.println("Print the index of an character that does not exist in String " + positionIndex);

        // String concatenation
        String a = "abc";
        String b = "def";
        // use + operator to concatenate the string a and b;
        String c = a + b;
        System.out.println(c);


        // from now, I list some operations for StringBuffer
        StringBuffer stringBuffer = new StringBuffer("This is a String object");
        System.out.println("Here is the index of 'is' in string index " + stringBuffer.indexOf("a"));

        // append method
        StringBuffer stringBuffer1 = stringBuffer.append(". This is an append String !");
        System.out.println(stringBuffer1);


        // reverse method
        StringBuffer stringBuffer2 = stringBuffer1.reverse();
        System.out.println(stringBuffer2);

    }
}
