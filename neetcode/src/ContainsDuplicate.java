import java.util.HashSet;
import java.util.Set;

/**
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 *
 * Example 1:
 * Input: nums = [1,2,3,1]
 * Output: true
 *
 * Example 2:
 * Input: nums = [1,2,3,4]
 * Output: false
 *
 */


public class ContainsDuplicate {
    public static void main(String[] args) {
        System.out.println("check");
    }
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numsUnique = new HashSet<>();
        for(int i =0; i < nums.length; i++){
            int num = nums[i];
            if(!numsUnique.contains(num)){
                numsUnique.add(num);
            }else{
                return true;
            }
        }
        return false;
    }
    }
