package sort;

public class Sorts {

    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for(int j=0;j < nums.length-i-1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void quickSort(int nums[],int start,int end) {
        if(start<end) {
            int base = nums[start];
            int left = start;
            int right = end;

            while (left < right){
                while(left < right && base <= nums[right]) {
                    right --;
                }

                nums[left] = nums[right];

                while(left < right && base >= nums[left]) {
                    left ++;
                }
                nums[right] = nums[left];
            }

            nums[left] = base;

            quickSort(nums,start,left);
            quickSort(nums,left+1,end);
        }



    }
}
