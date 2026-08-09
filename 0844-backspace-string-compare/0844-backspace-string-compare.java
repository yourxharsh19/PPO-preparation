class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> stacks = new Stack<>();
        Stack<Character> stackt = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '#') {
                if (!stacks.isEmpty()) {
                    stacks.pop();
                }
            } else {
                stacks.push(ch);
            }
        }
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (ch == '#') {
                if (!stackt.isEmpty()) {
                    stackt.pop();
                }
            } else {
                stackt.push(ch);
            }
        }
        if(stacks.size()!=stackt.size()) return false;
        for(int i=0;i<s.length();i++){
            while(!stacks.isEmpty()&&!stackt.isEmpty()){
                char ch1=stacks.pop();
                char ch2=stackt.pop();
                if(ch1!=ch2) return false;
            }
        }
        return true;
    }
}