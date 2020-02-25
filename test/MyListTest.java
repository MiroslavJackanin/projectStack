import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import sk.itsovy.jackanin.linkedList.MyList;
import sk.itsovy.jackanin.linkedList.Node;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MyListTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void addToList() {
        MyList<String> myList1 = new MyList<>();
        MyList<Integer> myList2 = new MyList<>();
        MyList<Date> myList3 = new MyList<>();
        MyList<Object> myList4 = new MyList<>();

        Node<String> node1 = new Node<>("Test node 1");
        Node<String> node2 = new Node<>(null);
        Node<String> node3 = new Node<>("");
        Node<Integer> node4 = new Node<>(10);
        Node<Date> node5 = new Node<>(new Date());
        Node<Date> node6 = new Node<>(new Date());
        Node<String> node7 = new Node<>("Test node 2");
        Node<Integer> node8 = new Node<>(456);

        assertEquals(0, myList1.getSize(), "Has to be 0");
        myList1.addToFront(node1);
        assertNotNull(myList1.getByName("Test node 1"));
        assertNull(myList1.getByName("Test node 2"));
        myList1.addToFront(null);
        myList1.addToEnd(null);
        myList1.addAtPosition(null, 1);
        assertEquals(1, myList1.getSize());

        myList3.addToFront(node5);
        assertEquals(node5, myList3.getHead());
        myList3.addToFront(node6);
        assertNotEquals(node5, myList3.getHead());

        /*myList2.addToEnd(node4);
        Node<Integer> tmp = myList2.getHead();
        while(tmp.getNext() != null)
            tmp = tmp.getNext();
        assertEquals(node4, tmp);
        myList2.addToEnd(node8);
        tmp = myList2.getHead();
        while(tmp.getNext() != null)
            tmp = tmp.getNext();
        assertNotEquals(node4, tmp);
        myList2.addToEnd(node8);

        myList2.removeAll();
        assertNull(myList2.getHead());
        myList2.addToFront(node4);
        myList2.addToFront(node8);
        assertNotNull(myList2.getHead());*/
    }

    @Test
    void print() {
    }

    @Test
    void remove() {
        MyList<String> myList = new MyList<>();
        Node<String> node1 = new Node<>("Data");
        Node<String> node2 = new Node<>("Dat");

        myList.addAtPosition(node1, 5050);
        myList.addAtPosition(node2, -2051);
        assertNotNull(myList.getHead());
        myList.remove(node1);
        myList.remove(node2);
        assertNull(myList.getHead());
    }

    @Test
    void removeAll() {
    }

    @Test
    void getByName() {
    }

    @Test
    void getSize() {
        MyList<String> myList = new MyList<>();

        assertEquals(0, myList.getSize(), "Has to be 0");
        Node<String> node1=new Node<>("Test node 1");
        Node<String> node2=new Node<>("Test node 2");
        Node<String> node3=new Node<>("Test node 3");
        myList.addToFront(node1);
        assertEquals(1,myList.getSize(),"Has to be 1");
        myList.addToFront(node2);
        assertEquals(2,myList.getSize(),"Has to be 2");
        myList.addToFront(node3);
        assertEquals(3,myList.getSize(),"Has to be 3");
        myList.remove(node1);
        assertEquals(2,myList.getSize(), "Has to be 2 after remove");
        myList.removeAll();
        assertEquals(0,myList.getSize(),"Has to be 0");
    }
}