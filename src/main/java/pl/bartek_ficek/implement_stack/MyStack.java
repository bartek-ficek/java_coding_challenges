package pl.bartek_ficek.implement_stack;

public class MyStack {

    /**
     * int array[] - collection to storing data in my Stack implementation
     */
//    we assume here that MyStack only can store integers. In the case of others objects
//    we have to think about another collection to storing (not an array)
    private int array[];

    /**
     * Index of top item in the stack.
     * Starting index of the top equals -1.
     */
    private int top;

    /**
     * capacity of the stack
     */
//    we assume here that our MyStack has limited capacity established in constructor
//    (it is not only right approach to the issue, just example)
    private int capacity;

    public MyStack(int capacity) {
        this.array = new int[capacity];
        this.capacity = capacity;
        this.top = -1;
    }

    public void push(int item) {
        array[++top] =item;
    }

    public int pop() {
        return array[top--];
    }

    public int peek() {
        return array[top];
    }
}
