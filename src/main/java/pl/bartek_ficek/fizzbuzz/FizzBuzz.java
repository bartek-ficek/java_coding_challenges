package pl.bartek_ficek.fizzbuzz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FizzBuzz {

    private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");

    public static void main(String[] args) {

        printFizzBuzz2(100);
    }

    public static void printFizzBuzz1(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 15 != 0) {
                STDOUT.info("\nFizz");
            } else if (i % 5 == 0 && i % 15 != 0) {
                STDOUT.info("\nBuzz");
            } else if (i % 15 == 0) {
                STDOUT.info("\nFizzBuzz");
            } else STDOUT.info("\n{}", i);
        }
    }

    public static void printFizzBuzz2(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                STDOUT.info("\nFizzBuzz");
                continue;
            }
            if (i % 5 == 0) {
                STDOUT.info("\nBuzz");
                continue;
            }
            if (i % 3 == 0) {
                STDOUT.info("\nFizz");
            } else STDOUT.info("\n{}", i);
        }
    }
}
