package stack;


import org.junit.Test;

public class MyStackTest {

    @Test
    public void test_push() {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(5);
        myStack.push(2);
        System.out.println(myStack.toString());
    }

    @Test
    public void test_pop() {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(5);
        myStack.push(2);
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

    }

}