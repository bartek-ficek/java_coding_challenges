package pl.bartek_ficek.implement_stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyStackMain {

    private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");

    public static void main(String[] args) {

    }











//    testingOperators don't connected with Implement Stack challenge
    private static void testingOperators() {

        int top = 2;

        System.out.println("top " + top);
        System.out.println("top++ " + top++ );
        System.out.println("top " + top);

        System.out.println("\ntop " + top);
        System.out.println("++top " + ++top);
        System.out.println("top " + top);

        System.out.println("\ntop " + top);
        System.out.println("top-- " + top--);
        System.out.println("top " + top);

        System.out.println("\ntop " + top);
        System.out.println("--top " + --top);
        System.out.println("top " + top);
    }

}
