package sort;

public class HeapSort {

    public static void sort(int arr[]) {
        int[] result = new int[arr.length];
        int startIdx =(arr.length-1)/2;
        for (int i = startIdx; i>=0; i--) {
            buildMaxHeap(arr,arr.length,i);
        }

        for (int i = arr.length-1; i >0 ; i--) {
           int temp = arr[0];
           arr[0] = arr[i];
           arr[i] = temp;
           buildMaxHeap(arr,i,0);
        }
    }

    public static void buildMaxHeap(int arr[],int size,int index) {
        // 左子节点
        int leftChildIdx = 2*index + 1;

        // 右子节点
        int rightChildIdx = 2*index + 2;

        int maxIdx = index;

        if(leftChildIdx <size && arr[leftChildIdx] > arr[maxIdx]) {
            maxIdx = leftChildIdx;
        }

        if(rightChildIdx < size && arr[rightChildIdx] > arr[maxIdx]) {
            maxIdx = rightChildIdx;
        }

        if (maxIdx != index) {
            int temp = arr[index];
            arr[index] = arr[maxIdx];
            arr[maxIdx] = temp;
            buildMaxHeap(arr,size,maxIdx);
        }
    }

}
