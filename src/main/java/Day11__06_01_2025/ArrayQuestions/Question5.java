package Day11__06_01_2025.ArrayQuestions;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Question5 {
    public static void main(String[] args) {
        int []arr = {1,1,1,2,2,3,4,5,6,6};
        int []frequency = new int[arr.length];

        for (int i = 0; i< arr.length;i++){
            int count = 0;
            for (int j = 0;j< arr.length;j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            frequency[i] = count;
        }
        for (int i = 0;i< arr.length ;i++){
           System.out.println("Element " + arr[i] + " Frequency : " + frequency[i]);
        }

        Map<Integer, Long> frequencyMap = Arrays.stream(arr)
                .boxed() // Convert int[] to Stream<Integer>
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        // Print the frequencies
        frequencyMap.forEach((key, value) -> System.out.println(key + ": " + value));
    }

    public static void countFrequency(int[] arr) {
        Arrays.sort(arr); // Sort the array
        int n = arr.length;

        for (int i = 0; i < n; ) {
            int count = 1;

            // Count occurrences of the current element
            while (i + 1 < n && arr[i] == arr[i + 1]) {
                count++;
                i++;
            }

            // Print the element and its frequency
            System.out.println(arr[i] + ": " + count);
            i++;
        }
    }

    public static void countFrequency2(int[] arr) {
        int max = 0;

        // Find the maximum value in the array
        for (int num : arr) {
            max = Math.max(max, num);
        }

        // Create a frequency array
        int[] frequency = new int[max + 1];

        // Count frequencies
        for (int num : arr) {
            frequency[num]++;
        }

        // Print the frequencies
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + ": " + frequency[i]);
            }
        }
    }

}
