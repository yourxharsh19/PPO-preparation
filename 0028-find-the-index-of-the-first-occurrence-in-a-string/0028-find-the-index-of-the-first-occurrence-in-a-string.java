class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int count = 0;
            for (int j = 0; j < needle.length(); j++) {
                if (needle.charAt(j) == haystack.charAt(i + j)) {
                    count++;
                    if (count == needle.length()) {
                         return i;
                    } 
                }
                else {
                        break;
                    }
            }
        }
        return -1;
    }
}