package Day10_04_01_2025;

public class MergeSort {

    public void sort(int []arr){

        if (arr.length < 2) return;
        // divide
        int mid = arr.length/2;

        //Creating Left Half of the array
        int [] left = new int [mid];
        for (int i = 0;i<mid;i++)
            left[i] = arr[i];


        // Creating Right array
        int [] right = new int [arr.length - mid];
        for (int i = mid; i<arr.length;i++)
            right[i - mid] = arr[i];

        // sorting left array
        sort(left);

        //sorting right array
        sort(right);

        //merging array
        merge(left,right,arr);

    }

    private void merge(int []left,int [] right, int [] result){
        int i = 0, j = 0, k = 0;
        while (i< left.length && j< right.length){
            if(left[i] <= right[j]){
                result[k++] = left[i++];
            }
            else {
                result[k++] = right[j++];
            }
        }

        while (i< left.length) result[k++] = left[i++];
        while (j< right.length) result[k++] = right[j++];
    }
}
