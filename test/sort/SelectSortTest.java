package sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SelectSortTest {

    @Test
    public void sort() {
        int[] nums = {2,43,4,77,5,41,75,4,32,1};
        SelectSort.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}