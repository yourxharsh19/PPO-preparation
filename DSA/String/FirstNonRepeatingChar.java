/*
 * Title: First Non-Repeating Character in a String
 * Difficulty: Easy
 * Tags: String, Hashing
 *
 * Description:
 * Given a string, find the first non-repeating character in it and return it.
 * If there is no non-repeating character, return '_'.
 *
 * Example:
 * Input: s = "leetcode"
 * Output: 'l'
 * Explanation: The first non-repeating character is 'l'.
 *
 * Constraints:
 *  - 1 <= s.length <= 10^5
 *  - s consists of lowercase English letters.
 *
 * Note:
 * The solution uses an array to count the frequency of each character and then finds the first character with a frequency of 1.
 */
public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "leetcode";
        int[] freq = new int[26]; 
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c - 'a']++;
        }
        char ans = '_';
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                ans = s.charAt(i);
                break;
            }
        }

        System.out.println("First non-repeating character: " + ans);
    }  
}
