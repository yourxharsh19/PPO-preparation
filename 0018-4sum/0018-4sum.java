class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n=nums.length;
        ArrayList<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(i>0 && nums[i]==nums[i-1]) continue;
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                int l=j+1;
                int r=n-1;
                while(l<r){
                    if((long)nums[i]+nums[j]+nums[l]+nums[r]==target){
                        list.add(Arrays.asList(nums[i],nums[j],nums[l],nums[r]));
                        l++;
                        r--;
                        while(l<r && nums[l]==nums[l-1]) l++;
                        while(l<r && nums[r]==nums[r+1]) r--;
                    }
                    else if((long)nums[i]+nums[j]+nums[l]+nums[r]<target){
                        l++;
                    }
                    else{
                        r--;
                    }
                }
            }
        }
        return list;
    }
}