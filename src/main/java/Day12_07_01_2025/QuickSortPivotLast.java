package Day12_07_01_2025;

import java.util.Arrays;

public class QuickSortPivotLast {

    public static void main(String[] args) {
        QuickSortPivotLast quickSortPivotLast = new QuickSortPivotLast();
        int [] arr = {1,24,6,4,32,1,2356,7,8};
        quickSortPivotLast.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void sort(int []arr){
        sort(arr,0,arr.length -1);
    }

    public void sort(int [] arr, int start , int end){
        if (start >= end)
            return;
        int boundary = partition(arr,start,end);

        sort( arr,start,boundary-1);
        sort( arr,boundary +1, end);
    }

    private int partition(int []arr,int start, int end){
        int pivot = arr[end];
        int boundary = start - 1;
        for (int i = start;i<end;i++){
            if(arr[i] <= pivot){
                swap(arr,i,++boundary);
            }
        }
        swap(arr,boundary+1,end);
        return boundary + 1 ;
    }

    private void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
