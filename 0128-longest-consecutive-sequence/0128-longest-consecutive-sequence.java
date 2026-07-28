class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int ans=0;
        for(int i : set){
            if(!set.contains(i-1)){
                int j=1;
               while(set.contains(i+j)){
                j++;
               }
               if(ans<j){
                ans=j;
               }
            }
        }
        return ans;
    }
}