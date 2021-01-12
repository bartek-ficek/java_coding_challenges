package pl.bartek_ficek.reverse_a_string;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReverseAString {

    private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");

    public static void main(String[] args) {

        String givenString = "example";
        String reversedString1 = reverseStringWay1(givenString);
        String reversedString2 = reverseStringWay2(givenString);
        String reversedString3 = reverseStringWay3(givenString);
        STDOUT.info("\n{}", reversedString1);
        STDOUT.info("\n{}", reversedString2);
        STDOUT.info("\n{}\n", reversedString3);
    }

    static String reverseStringWay1(String string) {
        return new StringBuilder(string).reverse().toString();
    }

    static String reverseStringWay2(String string) {
        int length = string.length();
        char[] stringAsChars = string.toCharArray();
        char[] reversedChars = new char[length];
        for (int i = length - 1; i >= 0; i--) {
            reversedChars[length - 1 - i] = stringAsChars[i];
        }
        return String.valueOf(reversedChars);
    }

    static String reverseStringWay3(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            stringBuilder.append(string.charAt(i));
        }
        return stringBuilder.toString();
    }

}
