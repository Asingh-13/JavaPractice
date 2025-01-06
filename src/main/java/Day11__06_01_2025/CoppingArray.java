package Day11__06_01_2025;

public class CoppingArray {
    public static void main(String[] args) {
        Integer [ ]arr = new Integer[3];
        // resizing an array
        // In this we are not actually reSizing an array we are just pointing the reference to new array object
        arr = new Integer[4];

        Integer[] arr2 = {1,2,3,4};
        arr = arr2.clone();
        System.out.println(arr.hashCode());
        System.out.println(arr[2] + " HashCode - "+arr[0].hashCode());
        System.out.println(arr2[2] + " HashCode - "+arr2[0].hashCode());
        System.out.println(arr2.hashCode()); // Clone Perform Sallow copy of the object new array object is created for array
        //But the element of that object referencing the same object in the memory

        System.out.println();
        arr = arr2;

        System.out.println(arr.hashCode());
        System.out.println(arr2.hashCode());

    }
}
