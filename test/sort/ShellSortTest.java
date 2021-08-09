package sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ShellSortTest {

    @Test
    public void sort() {
        //int[] nums = {10,9,8,7,6,5,4,3,2,1};
        int[] nums = {2,43,4,77,5,41,75,4,32,1};
        ShellSort.sort(nums);
        System.out.println(Arrays.toString(nums));
    }

}