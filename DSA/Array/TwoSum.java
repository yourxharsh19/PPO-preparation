// Problem: Two Sum
// Link: https://leetcode.com/problems/two-sum/
// Difficulty: Easy
// Time: O(n), Space: O(n)

package DSA.Array;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length ; i++){
            for(int j=i+1;j<nums.length ;j++){
                int sum = nums[i]+ nums[j];
                if(sum==target){
                return new int[]{i,j};
                   }
                }
           }
        return new int[] {};
    }
}
