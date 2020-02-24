package sk.itsovy.jackanin.linkedList;

public class MyList<T> {
    private Node<T> head;

    public void addToFront(Node<T> node){
        if (node == null){
            return;
        }
        if (head == null) {
            head = node;
            node.setNext(null);
        }else {
            node.setNext(head);
            head = node;
        }
    }

    public void addToEnd(Node<T> node){
        if (node == null){
            return;
        }
        Node<T> node1 = head;
        while(node1.getNext() != null){
            node1 = node1.getNext();
        }
        node1.setNext(node);
        node.setNext(null);
    }

    public void addAtPosition(Node<T> node, int index){
        if (node == null){
            return;
        }
        if (index <= 0){
            addToFront(node);
        }else if (index >= getSize()){
            addToEnd(node);
        }else {
            Node<T> node1 = head;
            for (int i = 1; i < index; i++) {
                node1 = node1.getNext();
            }
            node.setNext(node1.getNext());
            node1.setNext(node);
        }
    }

    public void print(){
        if (head == null){
            System.out.println("Empty list");
        }else {
            Node<T> node1 = head;
            while (node1 != null) {
                System.out.println(node1.getData());
                node1 = node1.getNext();
            }
        }
    }

    public void remove(Node<T> node){
        if (node == null || head == null){
            return;
        }
        if (head == node){
            head = node.getNext();
            return;
        }
        Node<T> node1 = head;
        while(node1.getNext() != node){
            node1 = node1.getNext();
            if (node1 == null){
                return;
            }
        }
        node1.setNext(node.getNext());
    }

    public void removeAll(){
        head = null;
    }

    public Node<T> getByName(String name){
        if (name == null || head == null){
            return null;
        }
        Node<T> node1 = head;
        while(node1!=null){
            if (node1.getData().equals(name)){
                return node1;
            }
            node1 = node1.getNext();
        }
        return null;
    }

    public int getSize(){
        if (head == null){
            return 0;
        }
        Node<T> node = head;
        int temp = 1;
        while(node.getNext() != null){
            node = node.getNext();
            temp++;
        }
        return temp;
    }
}