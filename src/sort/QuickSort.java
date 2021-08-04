package sort;

public class QuickSort {

    public static void sort(int nums[],int start,int end) {
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

            sort(nums,start,left);
            sort(nums,left+1,end);
        }
    }
}
