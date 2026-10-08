class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int c=0;
        for(int i=0;i<s.length();i++){
            if ((s.charAt(i) == '(' ? c++ : --c) > 0){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}