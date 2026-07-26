class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int max = 0;
        int start = 0;
        for (int i = 0; i < n; i++) {
            int left = i;
            int right = i;
            while (left >= 0 && right < s.length() && (s.charAt(left) == s.charAt(right))) {
                if (right - left + 1 > max) {
                    max = right - left + 1;
                    start = left;
                }
                left--;
                right++;
            }
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() && (s.charAt(left) == s.charAt(right))) {
                if (right - left + 1 > max) {
                    max = right - left + 1;
                    start = left;
                }
                left--;
                right++;
            }
        }
        return s.substring(start, start + max);
    }
}