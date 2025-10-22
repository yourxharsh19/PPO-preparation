/*
 * Title: 424. Longest Repeating Character Replacement
 * Difficulty: Medium
 * Tags: String, Sliding Window, Hashing
 *
 * Description:
 * You are given a string s and an integer k. You can choose any character of the string 
 * and change it to any other uppercase English character. You can perform this operation at most k times.
 *
 * Return the length of the longest substring containing the same letter you can get 
 * after performing the above operations.
 *
 * Example:
 * Input: s = "AABABBA", k = 1
 * Output: 4
 * Explanation: Replace one 'B' to get "AAAA" or "ABABA".
 *
 * Constraints:
 *  - 1 <= s.length <= 10^5
 *  - s consists of only uppercase English letters.
 *
 * Note:
 * This is a variable-size sliding window problem. The trick is to track the count of the most frequent character 
 * in the window to decide when to shrink or expand the window.
 */

 import java.util.*;
class LongestRepeating {
    public int characterReplacement(String s, int k) {
        int windowStart = 0;
        int maxLength = 0;
        Map<Character, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;

        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char ch = s.charAt(windowEnd);
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            maxFrequency = Math.max(maxFrequency, frequencyMap.get(ch));
            while(windowEnd - windowStart + 1 - maxFrequency > k) {
                char leftChar = s.charAt(windowStart);
                frequencyMap.put(leftChar, frequencyMap.get(leftChar) - 1);
                windowStart += 1;
            }

            maxLength = windowEnd - windowStart + 1;
        }
        return maxLength;
    }
}


