package Day12_07_01_2025;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        CountingSort countingSort = new CountingSort();
        countingSort.sort(new int[]{4,5,5,5,5,3,2,12});
    }
    public void sort(int []array){
        int length = 0;
        for(int i: array){
            if(i>length){
                length = i;
            }
        }

        int [] frequencyArray = new int[length +1];
        for (int i : array){
            frequencyArray[i]++;
        }
//        System.out.println(Arrays.toString(frequencyArray));

        int index = 0;
        for (int i = 0;i<frequencyArray.length;i++){
            if(frequencyArray[i]>0){
                while (frequencyArray[i]-- > 0){
                    array[index++] = i;
                }
            }
        }

//        System.out.println(Arrays.toString(array));
    }
}
