class Solution {
    public int digit(int n){
        int temp=n;
        int sum=0;
        while(temp>0){
            int d=temp%10;
            sum+=d;
            temp=temp/10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
     for(int i=0;i<nums.length;i++){
        if(digit(nums[i])==i){
            return i;
        }
     }
     return -1;
    }
}