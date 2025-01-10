package Day_31_2025;

import java.util.Arrays;

public class Problem2948 {
    public static void main(String[] args) {
        int [] result = new Problem2948().lexicographicallySmallestArray1(new int[]{5,100,44,45,16,30,14,65,83,64},2);

        System.out.println(Arrays.toString(result));
    }
    public int[] lexicographicallySmallestArray1(int[] nums, int limit) {
        for(int i = 0; i < nums.length; i++){
            for(int j = 0;j<nums.length;j++){
                if( (Math.abs(nums[i] - nums[j]) <= limit) &&
                        nums[j] > nums[i] &&
                        j < i){
                    swap(nums,i,j);
                }
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
