class Solution {
    public int maxDepth(String s) {
        int depth=0;
        int r=0;
        for(char ch : s.toCharArray()){
            if(ch==')') {
                depth--;
                  continue;
            }
            if(ch !='(') continue;
                depth++;
        
            if(depth>r) r=depth;
        }
        return r;
    }
}