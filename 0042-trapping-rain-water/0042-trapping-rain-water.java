class Solution {
    public int trap(int[] height) {
      int left=0;
      int right=height.length-1;
      int maxl=height[left];
      int maxr=height[right];
      int water=0;
      while(left<right){
        if(maxl<maxr){
            left++;
            maxl=Math.max(maxl,height[left]);
            water+=maxl-height[left];
        }
        else{
            right--;
            maxr=Math.max(maxr,height[right]);
            water+=maxr-height[right];
        }
      }
        return water;
    }
}