package Day11__06_01_2025;

import Day12_07_01_2025.CountingSort;
import Day12_07_01_2025.QuickSortPivotLast;
import Day10_04_01_2025.*;

import java.util.Random;

public class SortingPerformanceComparison {
    public static void main(String[] args) {
        int dataSize = 100000; // Change this for larger datasets
        SortingPerformanceComparison sortingPerformanceComparison = new SortingPerformanceComparison();
        int[] dataset = sortingPerformanceComparison.generateRandomArray(dataSize);

        System.out.println("Data size: " + dataSize);
        System.out.println();

//        int[] bubbleSortArray = dataset.clone();
//        BubbleSort bubbleSort = new BubbleSort();
//        long bubbleSortStart = System.currentTimeMillis();
//        bubbleSort.sort(bubbleSortArray);
//        long bubbleSortEnd = System.currentTimeMillis();
//        System.out.println("Bubble Sort Time: " + (bubbleSortEnd - bubbleSortStart) + " ms");
//
//
//        InsertionSort insertionSort = new InsertionSort();
//        int [] insertionSortArray= dataset.clone();
//        long insertionSortStart = System.currentTimeMillis();
//        insertionSort.sort(insertionSortArray);
//        long insertionSortEnd = System.currentTimeMillis();
//        System.out.println("Insertion Sort Time: " + (insertionSortEnd - insertionSortStart) + " ms");
//
//        int[] selectionSortArray = dataset.clone();
//        long selectionSortStart = System.currentTimeMillis();
//        SelectionSort selectionSort = new SelectionSort();
//        selectionSort.sort(selectionSortArray);
//        long selectionSortEnd = System.currentTimeMillis();
//        System.out.println("Selection Sort Time: " + (selectionSortEnd - selectionSortStart) + " ms");
//
//        int[] mergeSortArray = dataset.clone();
//        long mergeSortStart = System.currentTimeMillis();
//        MergeSort mergeSort = new MergeSort();
//        mergeSort.sort(mergeSortArray);
//        long mergeSortEnd = System.currentTimeMillis();
//        System.out.println("Merge Sort Time: " + (mergeSortEnd - mergeSortStart) + " ms");

        int [] quickSortRightPartisionArray = dataset.clone();
        long quickSortRStart = System.currentTimeMillis();
        QuickSortPivotLast quickSortPivotLast = new QuickSortPivotLast();
        quickSortPivotLast.sort(quickSortRightPartisionArray);
        long quickSortREnd = System.currentTimeMillis();
        System.out.println("Quick Sort Right Pivot Time: " + (quickSortREnd - quickSortRStart) + " ms");


        // Test Quick Sort
        int[] quickSortArray = dataset.clone();
        long quickSortStart = System.currentTimeMillis();
        QuickSort quickSort = new QuickSort();
        quickSort.sort(quickSortArray, 0, quickSortArray.length - 1);
        long quickSortEnd = System.currentTimeMillis();
        System.out.println("Quick Sort Time: " + (quickSortEnd - quickSortStart) + " ms");

        int[] countingSortArray = dataset.clone();
        long countingSortStart = System.currentTimeMillis();
        CountingSort countingSort = new CountingSort();
        countingSort.sort(countingSortArray);
        long countingSortEnd = System.currentTimeMillis();
        System.out.println("countingc Sort Time: " + (countingSortEnd - countingSortStart) + " ms");


    }

    private int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(100000); // Generate random integers
        }
        return arr;
    }
}
