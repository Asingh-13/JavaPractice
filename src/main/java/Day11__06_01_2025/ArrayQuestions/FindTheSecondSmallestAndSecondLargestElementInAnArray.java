package Day11__06_01_2025.ArrayQuestions;

import java.util.Arrays;

public class FindTheSecondSmallestAndSecondLargestElementInAnArray {
    public static void main(String[] args) {
        FindTheSecondSmallestAndSecondLargestElementInAnArray f = new FindTheSecondSmallestAndSecondLargestElementInAnArray();
        System.out.println(f.findTheSecondSmallest(new int[]{1,1,2,3,4,5,2,6}));
        System.out.println(f.findTheSecondLargest(new int[]{1,1,2,3,4,5,2,6}));
    }


    public int findTheSecondSmallest(int [] arr){
        int smallest = Integer.MAX_VALUE;
        for(int e : arr){
            if(e < smallest)
                smallest = e;
        }
        int secondSmallest = Integer.MAX_VALUE;
        for(int e : arr){
            if(e< secondSmallest && e!=smallest){
                secondSmallest = e;
            }
        }
        return secondSmallest;
    }

    public int findTheSecondSmallestStream(int[] arr) {
        return Arrays.stream(arr)
                .distinct() // Remove duplicates
                .sorted() // Sort the elements
                .skip(1) // Skip the smallest
                .findFirst() // Get the second smallest
                .orElseThrow(() -> new IllegalArgumentException("Array must contain at least two distinct elements"));
    }

    public int findTheSecondLargest(int []arr){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int e : arr){
            if (e>max){
                secondMax = max;
                max = e;
            }else if(e > secondMax && e != max){
                secondMax = max;
            }
        }
        return secondMax;
    }

}
