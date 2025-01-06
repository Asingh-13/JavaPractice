package Day10_04_01_2025;

public class QuickSort {
    private void swap(int [] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public int partition(int [] arr, int s, int e){
        int pivot = arr[s];

        int count=0;

        for(int i=s; i<=e; i++){
            if(arr[i] < pivot){
                count++;
            }
        }
        int pivotIndex=s+count;

        swap(arr, s , pivotIndex);

        while(s<e){
            while(s<pivotIndex && arr[s] < arr[pivotIndex]){
                s++;
            }

            while(e>pivotIndex && arr[e] > arr[pivotIndex]){
                e--;
            }

            if(s<e){
                swap(arr,s, e);
                s++;
                e--;
            }
        }

        return pivotIndex;
    }


    public void sort(int []  arr, int s, int e){
        if(s>=e) return;

        // Partition
        int p=partition(arr, s, e);

        // left part solve
        sort(arr, s, p-1);

        // right part solve
        sort(arr, p+1, e);
    }
}
