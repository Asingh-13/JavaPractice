package Day11__06_01_2025.ArrayPrintingQuestions;

import Day10_04_01_2025.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println( " Enter next input ");
        String s = sc.nextLine();
        System.out.println(s);
        int [][] array = new int[n][n];

        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                if(i==0){
                    array[i][j] = j+1;
                }
                if (i == n-1){
                    array[i][j] = j+1;
                }
            }
        }
        for (int [] a:
             array) {
            System.out.println(Arrays.toString(a));
        }
    }
}
