package Day11__06_01_2025;

import java.util.Arrays;
import java.util.Scanner;

public class AccessingArrayElement {
    public static void main(String... args) {
        //Array Declaration
        int [] array1 = new int[6]; // inside square braces we wil give hte size of the array

        // for initializing the
        // first way
        array1[0] = 1;
        array1[2] = 2;
        array1[1] = 3;

        //second way initialization in this way you can do declaration and initialization together
        int [] array2 = {1,2,3,4,5};  // int this you can not first declare and then initialize " array1 = {1,2,3,4}" this
        // is not possible

        Scanner sc = new Scanner(System.in);

        // initializing array by user input
        for (int i = 0; i< array1.length; i++){
            System.out.println("Please enter array element Ent integer ");
            int input = sc.nextInt();
            array1[i] = input;
        }

        System.out.println("Final array : " + Arrays.toString(array1));
    }
}
