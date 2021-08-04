package sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void sort() {
        int[] nums = {5,4,7,2,3,1,9,8};
        QuickSort.sort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
}