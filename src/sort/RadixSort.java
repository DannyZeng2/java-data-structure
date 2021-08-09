package sort;

import java.util.Arrays;

public class RadixSort {

    public static void sort(int[] arr)  {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        
        int maxLength = (max  +"").length();
        int[][] temp = new int[10][arr.length];
        for (int i = 0,n=1; i < maxLength; i++,n*=10) {
            int[] count = new int[10];
            for (int j = 0; j < arr.length; j++) {
                int digit = arr[j]/n %10;
                temp[digit][count[digit]] = arr[j];
                count[digit]++;
            }


            int index = 0;

            for (int k=0;k<count.length;k++) {
                if(count[k]!=0) {
                    for (int m=0;m<count[k];m++) {
                        arr[index] = temp[k][m];
                        index++;
                    }
                }
            }
        }
     }
}
