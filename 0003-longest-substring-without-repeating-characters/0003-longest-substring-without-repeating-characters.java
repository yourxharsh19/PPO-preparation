class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        int left=0;
        HashMap<Character,Integer> map= new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                char leftchar=s.charAt(left);
                map.put(leftchar,map.get(leftchar)-1);
                left++;
            }
            max=Math.max(max,i-left+1);
        }
        return max;
    }
}