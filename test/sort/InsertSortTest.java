package sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class InsertSortTest {

    @Test
    public void sort() {
        int[] nums = {5,4,3,2,1};
        InsertSort.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}