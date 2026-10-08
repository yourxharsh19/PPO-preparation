class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(map.get(nums[i]).equals(2)){
                set.add(nums[i]);
            }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int n : set){
            ans.add(n);
        }
        return ans;
    }
}