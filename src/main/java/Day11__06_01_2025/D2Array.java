package Day11__06_01_2025;

public class D2Array {
    public static void main(String[] args) {
        //2D array Declaration

        int [][] array1 = new int[2][3];

        // in array declaration size is compulsory to give size of first array int[2] and option for second array at run time also we can provide the size of that array

        int [][]array2 = new int[3][];
        // att runtime we can initialize the array

        array2[0] = new int[] {1, 2, 3, 4 ,5};
        array2[1] = new int[] {2,3,4};

        // in java array doesn't work as matrix we can create several 1d arrays inside 2d with different dimensions

        // Accessing elements from 2D array

        System.out.println(array2[0][1]);

        // We can't access the unInitialized array if we try to do so out code will compile fine but
        // We will get runtime error saying Null Pointer Exception

        // System.out.println(array2[2][2]);

        // We will not error for declared array as jvm will initialize that wil 0

        System.out.println(array1[1][2]); // o/p : 0z
    }
}
