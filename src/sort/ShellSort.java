package sort;

public class ShellSort {

    public static void sort(int arr[]) {

        for(int step= arr.length/2;step>0;step/=2) {
            for(int i = 0;i<step;i++) {
                for(int j=i;j<arr.length;j+=step) {
                    if(j+step>=arr.length) {
                        break;
                    }
                    if(arr[j+step]<arr[j]) {
                        int temp = arr[j+step];
                        arr[j+step] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

        }


    }
}
