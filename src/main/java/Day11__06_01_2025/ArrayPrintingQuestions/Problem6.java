package Day11__06_01_2025.ArrayPrintingQuestions;

import java.util.Arrays;

public class Problem6 {
    public static void main(String[] args) {
        int n = 3;
        int [][] array = new int[n][n];

        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                if(i==0) array[i][j] = j +1;
                if(j ==n/2) array[i][j] = j + i + 1;
                if (i == n-1 && j < n/2) array[i][j] = 2*n-j -1;
                if (i == n-1 && j > n/2) array[i][j] = n+j ;


            }
        }
        for (int [] a:
                array) {
            System.out.println(Arrays.toString(a));
        }
    }
}
