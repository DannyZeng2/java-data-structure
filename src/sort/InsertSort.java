package sort;

public class InsertSort {

    public static void sort(int[] nums) {

        for (int i = 1; i < nums.length; i++) {
            for (int j = i-1; j > 0; j--) {
                int base = nums[i];
                if(nums[i] < nums[j]) {
                    int temp = nums[j];
                    nums[j+1] = temp;
                }else {
                    nums[j] = base;
                    break;
                }
            }
        }

    }
}
