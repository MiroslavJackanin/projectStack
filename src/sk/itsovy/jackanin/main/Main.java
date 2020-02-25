package sk.itsovy.jackanin.main;

import sk.itsovy.jackanin.exception.StackOverflowException;
import sk.itsovy.jackanin.exception.StackUnderflowException;
import sk.itsovy.jackanin.linkedList.MyList;
import sk.itsovy.jackanin.linkedList.Node;

public class Main {
    public static void main(String[] args) throws StackOverflowException, StackUnderflowException {
        /*Stack<Integer> stack = new Stack<>(3);
        stack.push(17);
        stack.push(16);
        stack.push(15);
        stack.push(14);
        stack.push(13);

        stack.pop();
        stack.printStack();
*/
        MyList<String> myList = new MyList<>();

        myList.addToFront(new Node<String>("Miro"));
        myList.addToFront(new Node<String>("Jozef"));
        myList.addToFront(new Node<String>("Peto"));
        myList.addToEnd(new Node<String>("Riso"));
        myList.addToEnd(new Node<String>("Ondrej"));

        Node<String> node = new Node<>("TEST");
        myList.addAtPosition(node, 1);

        myList.print();
        System.out.println("-----------------");

        myList.remove(node);

        myList.print();

        System.out.println("---GET BY NAME---");
        System.out.println(myList.getByName("Peto").getData());
        System.out.println("----------------");
        myList.remove(myList.getByName("Peto"));

        myList.print();

        System.out.println("------------");
        myList.removeAll();

        myList.print();
    }
}
