import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 *
 * A subarray is a contiguous part of an array.
 *
 *
 *
 * Example 1:
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 *
 * Example 2:
 * Input: nums = [1]
 * Output: 1
 *
 * Example 3:
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 */


public class MaximumSubarray {
    public static void main(String[] args) {
        //System.out.println("check");
        System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maxSubArray(new int[]{1}));
        System.out.println(maxSubArray(new int[]{5,4,-1,7,8}));
        System.out.println(maxSubArray(new int[]{-2,-1}));
        System.out.println(sum(new int[]{-2,-1}));

    }
    public static int maxSubArray(int[] nums) {
        int highestSum = nums[0];
        for(int start = 0; start < nums.length; start++) {
          //  System.out.println("start is "+ start);
            for (int end = nums.length; end > start; end--) {
                int[] subArray = Arrays.copyOfRange(nums, start, end);
               // System.out.println(Arrays.toString(subArray));
                int currentSum = sum(subArray);
               // System.out.println("current sum" + currentSum);
              //  System.out.println("start = "+start+"  end = "+end);
                if (currentSum > highestSum) {
                    highestSum = currentSum;
                }
            }
        }
        return highestSum;
    }
    
    public static int sum(int[]nums){
        int s = nums[0];
        for(int i = 1; i < nums.length; i++){
            s += nums[i];
        }
        return s;
    }
}
