package Day11__06_01_2025.ArrayPrintingQuestions;

import java.util.Arrays;

public class Problem10 {
    public static void main(String[] args) {
        int n = 5;
        int [][] array = new int[n][n];

        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                if(i+j<n) array[i][j] = n-j - i;
                else array[i][j] = array[i][j-1] + 1 ;
            }
        }
        for (int [] a:
                array) {
            System.out.println(Arrays.toString(a));
        }
    }
}
