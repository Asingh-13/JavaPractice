package Day11__06_01_2025.ArrayQuestions;

import java.util.Arrays;

public class ReverseAGivenArray {
    public static void main(String[] args) {
        ReverseAGivenArray reverseAGivenArray = new ReverseAGivenArray();
        int [] arr = new int[]{1,2,3,5,6};
        reverseAGivenArray.reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    public void reverse(int [] arr){
        int i = 0;
        int j = arr.length -1;
        while (i < j){
            swap(arr,i++,j--);
        }
    }
    private void swap(int [] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
