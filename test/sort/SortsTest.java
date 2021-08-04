package sort;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortsTest {

    @Test
    public void bubbleSort() {
        int[] nums = {1,4,7,2,3};

        Sorts.bubbleSort(nums);

        printArray(nums);
    }

    @Test
    public void quickSort() {
        int[] nums = {5,4,7,2,3,1,9,8};

        Sorts.quickSort(nums,0,nums.length-1);

        printArray(nums);
    }


    private void printArray(int[] nums) {
        for (int num : nums) {
            System.out.println(num);
        }
    }


}