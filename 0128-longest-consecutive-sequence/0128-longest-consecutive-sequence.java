class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet();
        for(int num : nums){
            set.add(num);
        }
        int count=0;
        for(int x: set){
            if(!set.contains(x-1)){
                int j=1;
                while(set.contains(x+j)){
                   j++; 
                }
                if(count<j){
                    count=j;
                }
            }
        }
         return count;
    }
}