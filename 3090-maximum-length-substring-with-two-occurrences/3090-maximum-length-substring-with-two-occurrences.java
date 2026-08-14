class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int j=0;
        int max=0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2){
                char left=s.charAt(j);
                map.put(left,map.get(left)-1);
                j++;
            }
            max=Math.max(max,i-j+1);
        }
        return max;
    }
}