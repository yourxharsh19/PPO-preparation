class Solution {
    public int totalFruit(int[] fruits) {
        int j=0;
        int max=0;
        HashMap<Integer,Integer> map =new HashMap<>();
        for(int i=0;i<fruits.length;i++){
            map.put(fruits[i],map.getOrDefault(fruits[i],0)+1);
            while(map.size()>2){
                int start=fruits[j];
                map.put(start,map.get(start)-1);
                if(map.get(start)==0){
                    map.remove(start);
                }
                j++;
            }
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}