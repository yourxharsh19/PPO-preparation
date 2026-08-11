class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch : s1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count=0;
        int j=0;
        for(int i=0;i<s2.length();i++){
            char ch =s2.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0){
                    count++;
                }
            }
            if(i>s1.length()-1){
            char left=s2.charAt(j);
            j++;
            if(map.containsKey(left)){
                 if(map.get(left)==0){
                        count--;
                    }
                map.put(left,map.get(left)+1);
               }
            }
             if(count==map.size()) return true;
        }
        return false;
    }
}