/*
 * Title: 643. Maximum Average Subarray I
 * Difficulty: Easy
 * Tags: Array, Sliding Window
 * Description:
 * Given an integer array nums consisting of n elements, and an integer k.
 * Find a contiguous subarray whose length is equal to k that has the maximum average value
 * and return this value. Any answer with a calculation error less than 10^-5 will be accepted.
 *
 * Example:
 * Input: nums = [1,12,-5,-6,50,3], k = 4
 * Output: 12.75000
 *
 * Constraints:
 *  - 1 <= k <= nums.length <= 10^5
 *  - -10^4 <= nums[i] <= 10^4
 */

class MaxSubArray2 {
    public double findMaxAverage(int[] nums, int k) {
        int maxSum = 0; 
        int windowSum = 0;
    for (int i = 0; i < k; i++) {
        windowSum += nums[i];
    }
       maxSum = windowSum; 
      for (int i = k; i < nums.length; i++) {
        windowSum += nums[i] - nums[i - k];
        maxSum = Math.max(maxSum, windowSum);
    }
    return (double)maxSum/k;
  }
}

