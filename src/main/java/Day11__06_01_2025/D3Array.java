package Day11__06_01_2025;

import java.util.Arrays;

public class D3Array {
    public static void main(String[] args) {
        int [][][] array1 = new int[2][3][4];
        array1[0][0][0] = 10;
        array1[0][0][1] = 20;

        int [][][] arr2 = {
                {
                        {1, 2, 3}
                        , {2, 4}
                        , {2}
                },
                {
                        {1,2},
                        {0,1},
                        {2,1}
                }
        };

        for(int [][] arr : arr2){
            for (int [] innerArray : arr ){
                System.out.println(Arrays.toString(innerArray));
            }
        }
    }
}
