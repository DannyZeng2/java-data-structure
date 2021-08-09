package queue;

import java.util.Arrays;

public class MyQueue {
    private int[] arr;

    public MyQueue() {
        this.arr = new int[0];
    }

    public void add(int element) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = element;
        arr = newArr;
    }

    public int poll() {
        int[] newArr = new int[arr.length - 1];
        for (int i = 1; i < arr.length; i++) {
            newArr[i-1] = arr[i];
        }
        int firstElement = arr[0];
        arr = newArr;
        return firstElement;
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }

    public String show() {
        return Arrays.toString(arr);
    }
}
