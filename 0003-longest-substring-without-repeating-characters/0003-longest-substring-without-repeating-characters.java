class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map =new HashMap<>();
        int max=0;
        int j=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>1){
                char l=s.charAt(j);
                map.put(l,map.get(l)-1);
                j++;
            }
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}