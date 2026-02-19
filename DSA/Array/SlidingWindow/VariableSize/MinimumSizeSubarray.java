/*
 * Title: 209. Minimum Size Subarray Sum
 * Difficulty: Medium
 * Tags: Array, Sliding Window, Two Pointers, Prefix Sum
 *
 * Description:
 * Given an array of positive integers nums and a positive integer target, 
 * return the minimal length of a subarray whose sum is greater than or equal to target.
 * If there is no such subarray, return 0 instead.
 *
 * Example:
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
 *
 * Constraints:
 *  - 1 <= target <= 10^9
 *  - 1 <= nums.length <= 10^5
 *  - 1 <= nums[i] <= 10^4
 *
 * Note:
 * This problem is often solved using a variable-size sliding window approach.
 */
class MinimumSizeSubarray {
    public int minSubArrayLen(int target, int[] nums) {
      int windowstart=0;
      int windowsum=0;
      int min=Integer.MAX_VALUE;
      for(int windowend=0;windowend<nums.length;windowend++){
        windowsum += nums[windowend];
      while(windowsum >= target){
          min=Math.min(min,windowend-windowstart+1);
          windowsum -=nums[windowstart];
          windowstart++;
          }
      }
      return (min == Integer.MAX_VALUE) ? 0 : min;
    }
}
