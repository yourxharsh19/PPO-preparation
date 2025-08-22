/*
 * Title: 3. Longest Substring Without Repeating Characters
 * Difficulty: Medium
 * Tags: String, Sliding Window, Hashing
 *
 * Description:
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 * Example:
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 *
 * Constraints:
 *  - 0 <= s.length <= 5 * 10^4
 *  - s consists of English letters, digits, symbols and spaces.
 *
 * Note:
 * This is a classic variable-size sliding window problem solved using a HashSet or HashMap.
 */
import java.util.*;
class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int windowStart = 0;
        int maxLength = 0;
        Map<Character, Integer> frequencyMap = new HashMap<>();

        for(int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            char ch = s.charAt(windowEnd); 
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            while(frequencyMap.size() != (windowEnd - windowStart + 1)) {
                char leftChar = s.charAt(windowStart);
                frequencyMap.put(leftChar, frequencyMap.get(leftChar) - 1);
                if(frequencyMap.get(leftChar) == 0) {
                    frequencyMap.remove(leftChar);
                }
                windowStart += 1;
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
