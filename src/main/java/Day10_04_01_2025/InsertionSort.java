package Day10_04_01_2025;

import java.util.Arrays;

public class InsertionSort {
    public void sort(int [] arr){
        for (int i =1;i<arr.length;i++){
            int current = arr[i];
            int j = i -1 ;
            while (j >= 0 && arr[j] > current){
                arr[j +1 ] = arr[j -- ];
            }
            arr[j + 1] = current;
        }
//        System.out.println(Arrays.toString(arr));
    }

}
