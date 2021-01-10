package pl.bartek_ficek.fizzbuzz;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.stream.IntStream;

public class FizzBuzz {

    private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");

    public static void main(String[] args) {

        printFizzBuzz4(100);
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

    public static void printFizzBuzz3(int n) {
        IntStream.rangeClosed(1, n).mapToObj(
                i -> i % 15 == 0 ? "FizzBuzz" :
                        (i % 5 == 0) ? "Buzz" :
                                (i % 3 == 0) ? "Fizz" : i)
                .forEach(System.out::println);
    }

    public static void printFizzBuzz4(int n) {
        IntStream.rangeClosed(0, 100).mapToObj(
                i -> i % 3 == 0 ?
                        (i % 5 == 0 ? "FizzBuzz" : "Fizz") :
                        (i % 5 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }
}
