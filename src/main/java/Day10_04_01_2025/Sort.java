package Day10_04_01_2025;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
        Sort s = new Sort();
        int [] arr = {6, 2, 3, 4, 5, 1};
        QuickSort sort = new QuickSort();
        sort.sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
