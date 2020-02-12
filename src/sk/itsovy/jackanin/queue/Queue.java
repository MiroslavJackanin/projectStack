package sk.itsovy.jackanin.queue;

import sk.itsovy.jackanin.exception.QueueOverflowException;
import sk.itsovy.jackanin.exception.QueueUnderflowException;

import java.util.ArrayList;
import java.util.List;

public class Queue<T> {
    private int size;
    private int capacity;
    private List<T> list;

    public Queue(int capacity) {
        if (capacity <= 0){
            System.out.println("Invalid capacity");
            System.out.println("Capacity set to 5");
            this.capacity = 5;
        }else {
            this.capacity = capacity;
        }
        this.size = 0;
        list = new ArrayList<>();
    }

    public int getSize() {
        return size;
    }
    public int getCapacity() {
        return capacity;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return capacity==0;
    }

    public void enQueue(T obj) throws QueueOverflowException {
        if (obj == null){
            return;
        }else if (!isFull()){
            list.add(obj);
            size++;
        }else {
            throw new QueueOverflowException("Stack is full");
        }
    }

    public void deQueue() throws QueueUnderflowException {
        if (isEmpty()){
            throw new QueueUnderflowException("Stack is empty");
        }else {
            list.remove(0);
            size--;
        }
    }

    public T getFront(){
        if (isEmpty()){
            return null;
        }else {
            return list.get(0);
        }
    }

    public T getFrontAndDeque() throws QueueUnderflowException {
        T temp = getFront();
        deQueue();
        return temp;
    }

    public void printQueue(){
        for (int i=0; i<size; i++){
            System.out.println(list.get(i));
        }
    }
}
