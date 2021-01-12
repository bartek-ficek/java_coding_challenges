package pl.bartek_ficek.reverse_a_string;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReverseAString {

    private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");

    public static void main(String[] args) {

        String givenString = "example";
        String reversedString1 = reverseStringWay1(givenString);
        STDOUT.info(reversedString1);
    }

    static String reverseStringWay1(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        return stringBuilder.reverse().toString();
    }
}
