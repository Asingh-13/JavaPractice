package Day_31_2025;

import java.util.Arrays;

public class Problem2948_C {
    
    public static void main(String[] args) {
        int [] result = new Problem2948_C().lexicographicallySmallestArray(new int[]{5,100,44,45,16,30,14,65,83,64},2);

        System.out.println(Arrays.toString(result));
    }

    public int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;

        for (int i = 0; i < n; i++){
            while (true){
                int smallValue = nums[i];
                int idx  = -1;

                for (int j = i+1;j<n ; j++ ){
                    if (Math.abs(nums[i] - nums[j])<= limit){
                        smallValue = nums[j];
                        idx = j;
                    }
                }
                if (idx != -1){
                    swap(nums,i,idx);
                }
                else break;
            }
        }
        return nums;
    }


    public void swap(int [] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
