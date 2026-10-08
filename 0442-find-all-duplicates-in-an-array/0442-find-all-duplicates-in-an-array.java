class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        boolean[] seen = new boolean[nums.length + 1];
        ArrayList<Integer> ans=new ArrayList<>();
        for (int num : nums) {
            if (seen[num])
                ans.add(num);
            else
                seen[num] = true;
        }
        return ans;
    }
}