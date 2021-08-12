package sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class HeapSortTest {

    @Test
    public void sort() {

        int[] arr = new int[] {4,2,7,6,1,3,5,9,8,10};

        HeapSort.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}