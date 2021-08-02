package stack;

import java.util.Arrays;

public class MyStack {

    private int[] arr;

    public MyStack() {
        this.arr = new int[0];
    }

    public void push(int element) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = element;
        arr = newArr;
    }

    public int pop() {
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length-1; i++) {
            newArr[i] = arr[i];
        }
        int lastElement = arr[arr.length-1];
        arr = newArr;
        return lastElement;
    }

    @Override
    public String toString() {
        return "MyStack{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public String show() {
        return Arrays.toString(arr);
    }

}
