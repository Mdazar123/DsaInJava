import java.util.*;

public class StringMethods {
    public static void main(String[] args) {
        // Create a string
        String str = "Hello World";

        // 1. length(): Get the length of the string
        System.out.println("Length of the string: " + str.length());

        // 2. charAt(): Get the character at a specific index
        System.out.println("Character at index 4: " + str.charAt(4));

        // 3. substring(): Extract a substring
        System.out.println("Substring from index 6: " + str.substring(6));
        System.out.println("Substring from index 0 to 5: " + str.substring(0, 5));

        // 4. contains(): Check if the string contains a sequence
        System.out.println("Does the string contain 'World'? " + str.contains("World"));

        // 5. equals() and equalsIgnoreCase(): Compare strings
        System.out.println("Does 'Hello World' equal 'hello world'? " + str.equals("hello world"));
        System.out.println("Does 'Hello World' equalIgnoreCase 'hello world'? " + str.equalsIgnoreCase("hello world"));

        // 6. compareTo(): Compare strings lexicographically
        System.out.println("Comparing 'Hello' to 'World': " + "Hello".compareTo("World"));

        // 7. indexOf(): Find the first occurrence of a character or substring
        System.out.println("Index of 'W' in the string: " + str.indexOf('W'));
        System.out.println("Index of 'o' after index 5: " + str.indexOf('o', 5));

        // 8. lastIndexOf(): Find the last occurrence of a character or substring
        System.out.println("Last index of 'o' in the string: " + str.lastIndexOf('o'));

        // 9. toUpperCase() and toLowerCase(): Convert the string to upper or lower case
        System.out.println("Uppercase string: " + str.toUpperCase());
        System.out.println("Lowercase string: " + str.toLowerCase());

        // 10. startsWith() and endsWith(): Check if the string starts or ends with a given prefix/suffix
        System.out.println("Does the string start with 'Hello'? " + str.startsWith("Hello"));
        System.out.println("Does the string end with 'World'? " + str.endsWith("World"));

        // 11. trim(): Remove leading and trailing whitespace
        String strWithSpaces = "   Hello World   ";
        System.out.println("String after trim: '" + strWithSpaces.trim() + "'");

        // 12. replace(): Replace occurrences of a character or substring
        System.out.println("String after replacing 'World' with 'Java': " + str.replace("World", "Java"));
        System.out.println("String after replacing 'l' with 'x': " + str.replace('l', 'x'));

        // 13. split(): Split the string into an array of substrings
        String[] words = str.split(" ");
        System.out.println("Words in the string: " + Arrays.toString(words));

        // 14. join(): Join strings using a delimiter
        String joinedString = String.join(", ", "Apple", "Banana", "Cherry");
        System.out.println("Joined string: " + joinedString);

        // 15. isEmpty() and isBlank(): Check if the string is empty or blank
        String emptyStr = "";
        String blankStr = "   ";
        System.out.println("Is the string empty? " + emptyStr.isEmpty());
        System.out.println("Is the string blank? " + blankStr.isBlank());

        // 16. valueOf(): Convert other types to string
        int number = 100;
        System.out.println("String representation of number: " + String.valueOf(number));

        // 17. concat(): Concatenate two strings
        String str2 = "Java";
        System.out.println("Concatenated string: " + str.concat(" " + str2));

        // 18. matches(): Check if the string matches a regular expression
        String regexStr = "abc123";
        System.out.println("Does the string match the regex '[a-z]+[0-9]+'? " + regexStr.matches("[a-z]+[0-9]+"));

        // 19. toCharArray(): Convert the string to a character array
        char[] charArray = str.toCharArray();
        System.out.println("Character array: " + Arrays.toString(charArray));

        // 20. format(): Format strings like printf
        String formattedString = String.format("My name is %s and I am %d years old.", "Azhar", 22);
        System.out.println("Formatted string: " + formattedString);

        // 21. intern(): Get the canonical representation of the string
        String internedString = str.intern();
        System.out.println("Interned string: " + internedString);

        // 22. codePointAt(): Get Unicode code point at a specific index
        System.out.println("Unicode code point at index 0: " + str.codePointAt(0));

        // 23. regionMatches(): Compare substrings
        String anotherStr = "Hello Java";
        System.out.println("Do regions match? " + str.regionMatches(0, anotherStr, 0, 5));

        // 24. repeat(): Repeat the string n times (Java 11+)
        System.out.println("Repeated string (3 times): " + str.repeat(3));

        // 25. strip(), stripLeading(), and stripTrailing() (Java 11+)
        String strWithSpaces2 = "   Hello Java   ";
        System.out.println("String after strip: '" + strWithSpaces2.strip() + "'");
        System.out.println("String after stripLeading: '" + strWithSpaces2.stripLeading() + "'");
        System.out.println("String after stripTrailing: '" + strWithSpaces2.stripTrailing() + "'");
    }
}

