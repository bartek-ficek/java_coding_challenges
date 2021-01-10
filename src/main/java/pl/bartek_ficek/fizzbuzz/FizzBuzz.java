package pl.bartek_ficek.fizzbuzz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FizzBuzz {

    private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if (i % 3==0 && i % 15 !=0) {
                STDOUT.info("\nFizz");
            }
            else if (i % 5==0 && i % 15 !=0) {
                STDOUT.info("\nBuzz");
            }
            else if (i % 15==0) {
                STDOUT.info("\nFizzBuzz");
            }
            else STDOUT.info("\n{}",i);
        }
    }
}
