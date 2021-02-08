package pl.bartek_ficek.reverse_an_integer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReverseInteger {
    private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");

    public static void main(String[] args) {
    }

    public int reverseInteger(int input) {
        long reversed = 0;
        while (input != 0) {
            reversed = reversed*10 + input % 10;
            input /= 10;
        }
    }
}
