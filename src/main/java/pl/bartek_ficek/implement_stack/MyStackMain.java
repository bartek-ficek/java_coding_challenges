package pl.bartek_ficek.implement_stack;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Stack;

public class MyStackMain {

    private static final Logger STDOUT = LoggerFactory.getLogger("CONSOLE_OUT");

    public static void main(String[] args) {

        MyStack myStack = new MyStack(4);

        myStack.push(0);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println("initial MyStack: "+myStack);
        System.out.println("top: " + myStack.getTop());
        System.out.println("*******************************************************************");

        int poppedItem1 = myStack.pop();
        System.out.println("popped item: " + poppedItem1);
        System.out.println("stack after pop (not changed but field 'top' does): " + myStack);
        System.out.println("top: " + myStack.getTop());
        System.out.println("*******************************************************************");

        int poppedItem2 = myStack.pop();
        System.out.println("popped item: " + poppedItem2);
        System.out.println("stack after pop (not changed but field 'top' does): " + myStack);
        System.out.println("top: " + myStack.getTop());
        System.out.println("*******************************************************************");

        int peekedItem1 = myStack.peek();
        System.out.println("peeked item: " + peekedItem1);
        System.out.println("stack after peek not changed: " + myStack);
        System.out.println("'top' after peek doesn't changed: " + myStack.getTop());
        System.out.println("*******************************************************************");

        int pushedItem1 = 15;
        myStack.push(pushedItem1);
        System.out.println("pushed item: " + pushedItem1);
        System.out.println("stack after push changed: " + myStack);
        System.out.println("'top' after push changed: " + myStack.getTop());
        System.out.println("*******************************************************************");
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
