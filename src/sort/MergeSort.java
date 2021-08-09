package sort;

public class MergeSort {

    public static void merge(int[] arr,int left,int right) {
        int middle = (right + left)/2;
        if(left == right) {
            return;
        }

        merge(arr,left,middle);
        merge(arr,middle+1,right);
        sort(arr,left,middle,right);
    }

    private static void sort(int[] arr,int left,int middle,int right) {
        int i = left;
        int j = middle + 1;
        int[] temp = new int[right-left+1];
        int index = 0;
        while (i<=middle && j<=right) {
            if(arr[i]<=arr[j]){
                temp[index] = arr[i];
                i++;
            }else{
                temp[index] = arr[j];
                j++;
            }
            index ++;
        }

        while (j<=right) {
            temp[index] = arr[j];
            index++;
            j++;
        }

        while(i<=middle) {
            temp[index] = arr[i];
            index++;
            i++;
        }

        for(int k=0;k<temp.length;k++) {
            arr[left+k] = temp[k];
        }
    }
}
