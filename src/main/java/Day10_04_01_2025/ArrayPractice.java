package Day10_04_01_2025;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {

        // Create a one-dimensional array of integers, initialize it with values, and display the sum of all elements.
        int []a = {1,2,3,4,5};
        int sum = 0;
        for (int i : a){
            sum += i;
        }
        System.out.println("Sum : " + sum);
        // Alternative
        System.out.println("Sum : " + Arrays.stream(a).sum());

        int [] b = {1,2,3};
        int [] temp = a;
        a = b;
        b = temp;

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

//Write a program to declare a 2D array and print all its elements in matrix form.
        int [][] arr = new int [2][3];
       // arr ={{1,2,3},{2,3,4}}; Array is not allowed to get initialized in this way here

        arr [0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;

        //unnamed array
        for(int i :new  int[]{1, 2 , 3, 4, 5}){
            System.out.print(i +  " ");
        };
    }
}
