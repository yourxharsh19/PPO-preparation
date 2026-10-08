class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i]).equals(2)){
                ans.add(nums[i]);
                map.put(nums[i],0);
            }
        }
        return ans;
    }
}