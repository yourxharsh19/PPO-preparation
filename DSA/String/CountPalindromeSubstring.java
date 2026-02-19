/*
 * Title: Count Palindromic Substrings in a String
 * Difficulty: Medium
 * Tags: String, Brute Force 
 * Description:
 * Given a string, count the number of palindromic substrings present in it.
 *   Example:
 * Input: s = "aaa"
 * Output: 6
 * Explanation: The palindromic substrings are "a", "a", "a", "aa", "aa", "aaa".
 * Constraints:
 * - 1 <= s.length <= 1000
 * - s consists of lowercase English letters.
 * Note:
 * The solution uses a brute-force approach to generate all possible substrings and checks each for palindromicity.
 */
public class CountPalindromeSubstring {
    public static void main(String[] args) {
        String s = "aaa";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);
                if (isPalindrome(sub)) {
                    count++;
                }
            }
        }

        System.out.println("Total palindromic substrings: " + count);
    }

    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

}
