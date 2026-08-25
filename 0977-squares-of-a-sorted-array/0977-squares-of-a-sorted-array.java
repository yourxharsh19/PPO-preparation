class Solution {
    public int[] sortedSquares(int[] nums) {
        int ans[]=new int [nums.length];
        int left=0;
        int right=nums.length-1;
        int pos=nums.length-1;
        while(left<=right){
            if(nums[left]*nums[left]<nums[right]*nums[right]){
                ans[pos]=nums[right]*nums[right];
                right--;
            }
            else{
                ans[pos]=nums[left]*nums[left];
                left++;
            }
            pos--;
        }
        return ans;
    }
}