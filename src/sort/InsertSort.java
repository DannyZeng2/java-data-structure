package sort;

public class InsertSort {

    public static void sort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] < nums[i-1]){
                int temp = nums[i];
                int j;
                for (j = i-1; j >=0&&temp<nums[j]; j--) {
                    nums[j+1] = nums[j];
                }
                nums[j+1] = temp;
            }
        }

    }
}
