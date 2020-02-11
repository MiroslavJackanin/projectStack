package sk.itsovy.jackanin.stack;
import sk.itsovy.jackanin.exception.StackOverflowException;
import sk.itsovy.jackanin.exception.StackUnderflowException;

import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private int size;
    private int capacity;
    private List<T> list;

    public Stack(int capacity) {
        this.size = 0;
        this.capacity = capacity;
        list = new ArrayList<>();
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return capacity==0;
    }

    public int getCapacity(){
        return capacity;
    }

    public void push(T obj) throws StackOverflowException {
        if (obj == null){
            return;
        }else if (!isFull()){
            list.add(obj);
            size++;
        }else {
            throw new StackOverflowException("Stack is full");
        }
    }

    public void pop() throws StackUnderflowException {
        if (isEmpty()){
            throw new StackUnderflowException("Stack is empty");
        }else {
            list.remove(size-1);
            size--;
        }
    }

    public T top(){
        if (isEmpty()){
            return null;
        }else {
            return list.get(size-1);
        }
    }

    public T topAndPop() throws StackUnderflowException {
        T temp = top();
        pop();
        return temp;
    }

    public int getSize() {
        return size;
    }

    public void empty(){
        list.clear();
        size=0;
    }

    public void printStack(){
        for (int i=0; i<size; i++){
            System.out.println(list.get(i));
        }
    }
}
