class Solution {
    public String longestCommonPrefix(String[] strs) {
        String start=strs[0];
        for(int i=0;i<start.length();i++){
            char ch=start.charAt(i);
            for(int j=1;j<strs.length;j++){
                if(i>=strs[j].length() || strs[j].charAt(i)!=ch){
                    return start.substring(0,i);
                }
            }
        }
        return start;
    }
}