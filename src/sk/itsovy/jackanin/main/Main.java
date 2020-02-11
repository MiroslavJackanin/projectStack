package sk.itsovy.jackanin.main;

import sk.itsovy.jackanin.exception.StackOverflowException;
import sk.itsovy.jackanin.stack.Stack;

public class Main {
    public static void main(String[] args) throws StackOverflowException {
        Stack<Integer> stack = new Stack<>(3);
        stack.push(17);
        stack.push(17);
        stack.push(17);
        stack.push(17);
        stack.push(17);

        stack.printStack();
    }
}
