// Problem: Contains Duplicate
// Link: https://leetcode.com/problems/contains-duplicate/
// Difficulty: Easy
// Time: O(n), Space: O(n)

package DSA.Array;

import java.util.Arrays;

public class ContainsDuplicate {
     public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
     return false;
        }
}
