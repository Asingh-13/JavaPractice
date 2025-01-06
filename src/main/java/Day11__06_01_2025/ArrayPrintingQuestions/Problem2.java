package Day11__06_01_2025.ArrayPrintingQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        int n = 5;
        int [][] array = new int[n][n];

        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                if(i%2 == 0){
                    array[i][j] = i+1;
                }
            }
        }
        for (int [] a:
                array) {
            System.out.println(Arrays.toString(a));
        }
    }
}
