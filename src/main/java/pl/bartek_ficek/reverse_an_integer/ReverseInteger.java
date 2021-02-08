package pl.bartek_ficek.reverse_an_integer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReverseInteger {
    private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");

    public static void main(String[] args) {

        ReverseInteger reverseInteger = new ReverseInteger();
        int result = reverseInteger.reverseInteger(156);
        STDOUT.info("{}",result);

    }

    public int reverseInteger(int input) {
        long reversed = 0;
        while (input != 0) {
            reversed = reversed * 10 + input % 10;
            input /= 10;

            if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) reversed;
    }
}
