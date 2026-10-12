class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character,Integer> map=new HashMap<>();
       int max=0;
       int j=0;
       for(int i=0;i<s.length();i++){
        map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        while(map.get(s.charAt(i))>1){
            char st=s.charAt(j);
            map.put(st,map.get(st)-1);
            j++;
           }
           max=Math.max(max,i-j+1);
       }
       return max;
    }
}