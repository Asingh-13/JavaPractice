package Day10_04_01_2025;

import java.util.Arrays;

public class SelectionSort {
    public void sort(int []arr){
        for (int i = 0;i<arr.length;i++){
            int minIndex = i;
            for (int j = i;j< arr.length;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            if(arr[i] !=arr[minIndex]){
                swap(arr,i,minIndex);
            }
        }
//        System.out.println(Arrays.toString(arr));
    }

    private void swap(int []arr , int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
