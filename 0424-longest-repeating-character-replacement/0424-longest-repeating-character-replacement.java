class Solution {
    public int characterReplacement(String s, int k) {
      int j=0;
      int maxfreq=0;
      int maxlength=0;
      HashMap<Character,Integer> map = new HashMap<>();
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
        maxfreq=Math.max(maxfreq,map.get(ch));
        while((i-j+1)-maxfreq > k){
            char left=s.charAt(j);
            map.put(left,map.get(left)-1);
            j++;
        }
        maxlength=Math.max(maxlength,(i-j+1));
      }
  return maxlength;
    }
}