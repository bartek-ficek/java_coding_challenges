package pl.bartek_ficek.reverse_a_string;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReverseAString {

    private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");

    public static void main(String[] args) {

        String givenString = "example";
        String reversedString1 = reverseStringWay1(givenString);
        String reversedString2 = reverseStringWay2(givenString);
        STDOUT.info("\n{}\n",reversedString1);
        STDOUT.info(reversedString2);
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
}
