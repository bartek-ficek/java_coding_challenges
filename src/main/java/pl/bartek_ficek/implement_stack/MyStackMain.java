package pl.bartek_ficek.implement_stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

public class MyStackMain {

    private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");
    private static final String DIVISION = "*******************************************************************";

    public static void main(String[] args) {

        MyStack myStack = new MyStack(4);

        myStack.push(0);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        STDOUT.info("\ninitial MyStack: {}", myStack);
        STDOUT.info("\ntop: {}", myStack.getTop());
        STDOUT.info("\n" + DIVISION);

        int poppedItem1 = myStack.pop();
        STDOUT.info("\npopped item: {}", poppedItem1);
        STDOUT.info("\nstack after pop (not changed but field 'top' does): {}", myStack);
        STDOUT.info("\ntop: {}", myStack.getTop());
        STDOUT.info("\n" + DIVISION);

        int poppedItem2 = myStack.pop();
        STDOUT.info("\npopped item: {}", poppedItem2);
        STDOUT.info("\nstack after pop (not changed but field 'top' does): {}", myStack);
        STDOUT.info("\ntop: {}", myStack.getTop());
        STDOUT.info("\n" + DIVISION);

        int peekedItem1 = myStack.peek();
        STDOUT.info("\npeeked item: {}", peekedItem1);
        STDOUT.info("\nstack after peek not changed: {}", myStack);
        STDOUT.info("\n'top' after peek doesn't changed: {}", myStack.getTop());
        STDOUT.info("\n" + DIVISION);

        int pushedItem1 = 15;
        myStack.push(pushedItem1);
        STDOUT.info("\npushed item: {}", pushedItem1);
        STDOUT.info("\nstack after push changed: {}", myStack);
        STDOUT.info("\n'top' after push changed: {}", myStack.getTop());
        STDOUT.info("\n" + DIVISION);
    }


    //    testingOperators don't connected with Implement Stack challenge
    private static void testingOperators() {

        int top = 2;

        System.out.println("top " + top);
        System.out.println("top++ " + top++);
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
