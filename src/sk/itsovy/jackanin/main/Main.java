package sk.itsovy.jackanin.main;

import sk.itsovy.jackanin.exception.StackOverflowException;
import sk.itsovy.jackanin.exception.StackUnderflowException;
import sk.itsovy.jackanin.stack.Stack;

public class Main {
    public static void main(String[] args) throws StackOverflowException, StackUnderflowException {
        Stack<Integer> stack = new Stack<>(3);
        stack.push(17);
        stack.push(16);
        stack.push(15);
        stack.push(14);
        stack.push(13);

        stack.pop();
        stack.printStack();

    }
}
