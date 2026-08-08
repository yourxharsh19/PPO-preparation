class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        String currentString = "";
        int currentnum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                int digit = s.charAt(i) - '0';
                 currentnum = currentnum * 10 + digit;
            } else if (Character.isLetter(s.charAt(i))) {
                currentString += s.charAt(i);
            } else if (s.charAt(i) == '[') {
                countStack.push(currentnum);
                stringStack.push(currentString);
                currentnum = 0;
                currentString = "";
            }
            else{
                int poppednumber=countStack.pop();
                String poppedstring=stringStack.pop();
                currentString=poppedstring+currentString.repeat(poppednumber);
            }
        }
        return currentString;
    }
}