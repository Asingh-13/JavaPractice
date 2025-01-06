package Day11__06_01_2025;

import java.util.Arrays;

public class JaggedArray {
    public static void main(String[] args) {
        int [][]jaggedArray = new int[4][];
        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[3];
        jaggedArray[2] = new int[1];
        jaggedArray[3] = new int[2];

        jaggedArray[0][0] = 1;
        jaggedArray[0][1] = 2;

        jaggedArray[1][0] = 3;
        jaggedArray[1][1] = 4;
//        jaggedArray[1][2] = 5;

        jaggedArray[2][0] = 2;

        jaggedArray[3][0] = 4;
        jaggedArray[3][1] = 5;

        for (int [] arr : jaggedArray){
            System.out.println("Length of array " + arr.length + " Array : " + Arrays.toString(arr));
        }


    }
}
