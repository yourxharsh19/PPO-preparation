class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num : nums){
            if(num<min){
               min= num;
            }
            if(num>max){
                max=num;
            }
        }
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=min;i<=max;i++){
                list.add(i);
            }
            for(int num : nums){
                if(list.contains(num)){
                    list.remove(Integer.valueOf(num));
                }
            }
        return list;
    }
}