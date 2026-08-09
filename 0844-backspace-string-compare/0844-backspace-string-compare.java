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
        StringBuilder sb = new StringBuilder();

        while (!stacks.isEmpty()) {
            sb.append(stacks.pop());
        }

        String st1 = sb.toString();

        StringBuilder sbr = new StringBuilder();

        while (!stackt.isEmpty()) {
            sbr.append(stackt.pop());
        }

        String st2 = sbr.toString();

        if (st1.equals(st2)) {
            return true;
        }
        return false;
    }
}