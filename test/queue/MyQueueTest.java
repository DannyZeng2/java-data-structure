package queue;

import org.junit.Test;
import stack.MyStack;

import static org.junit.Assert.*;

public class MyQueueTest {

    @Test
    public void add() {
        MyQueue queue = new MyQueue();
        queue.add(1);
        queue.add(5);
        queue.add(2);
        queue.add(8);
        queue.add(6);
        System.out.println(queue.toString());
    }

    @Test
    public void poll() {
        MyQueue queue = new MyQueue();
        queue.add(1);
        queue.add(5);
        queue.add(2);
        System.out.println(queue.toString());
        System.out.println(queue.poll());
        System.out.println(queue.toString());
    }
}