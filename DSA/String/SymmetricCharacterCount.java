/*
 * Title: Count Matching Characters with Reversed String
 * Difficulty: Easy
 * Tags: String, StringBuilder, Iteration
 * Description:
 * Given a string s, count the number of positions where
 * the character in the original string matches the character
 * at the same position in its reversed string.
 *
 * Example:
 * Input:
 * s = "abcda"
 *
 * Output:
 * 3
 *
 * Explanation:
 * Original  : a b c d a
 * Reversed  : a d c b a
 * Matching positions:
 * index 0 → a == a
 * index 2 → c == c
 * index 4 → a == a
 * Total matches = 3
 *
 * Constraints:
 *  - 1 <= s.length <= 10^5
 *  - s consists of valid characters.
 *
 * Note:
 * If the string is a palindrome, the count will be equal
 * to the length of the string.
 */

import java.util.*;

public class SymmetricCharacterCount {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "abcda"; 
        int count = 0;
        int n = s.length(); 
        StringBuilder reversed = new StringBuilder(s).reverse();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == reversed.charAt(i)) {
                count++;
            }
        }

        System.out.println(count);
        in.close(); 
    }
}
