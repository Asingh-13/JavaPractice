package Day10_04_01_2025;

import java.util.Arrays;

public class BubbleSort {
    public void sort(int [] arr){
        for (int i = 0;i<arr.length;i++){
            boolean isSorted = true;
            for (int j = i + 1 ;j< arr.length ;j++){
                if(arr[i]> arr[j]){
                    swap(arr,i,j);
                    isSorted = false;
                }
            }
            if(isSorted) {
                System.out.println(Arrays.toString(arr));
                return;
            }
        }
        System.out.println(Arrays.toString(arr));
    }



    private void swap(int []arr , int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

}
