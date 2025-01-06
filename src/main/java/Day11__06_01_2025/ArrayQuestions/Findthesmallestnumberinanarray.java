package Day11__06_01_2025.ArrayQuestions;

import java.util.Arrays;

public class Findthesmallestnumberinanarray {
    public static void main(String[] args) {
        int [] arr = {3,2,5,6,7,1};
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.println("Min by Stream API : " + min);


        min = Integer.MAX_VALUE;
        for (int i:
             arr) {
            if(i<min){
                min = i;
            }
        }

        System.out.println("Min by custom method : " +min);
    }
}
