/*
 * Title: Count Vowels in a String
 * Difficulty: Easy
 * Tags: String, Iteration
 *
 * Description:
 * Given a string, count the number of vowels (a, e, i, o, u) present in it.
 *
 * Example:
 * Input: s = "Harsh"
 * Output: 1
 * Explanation: The vowel present is 'a'.
 *
 * Constraints:
 *  - 1 <= s.length <= 10^5
 *  - s consists of English letters only.
 *
 * Note:
 * The solution iterates through the string and checks each character to see if it is a vowel.
 */

public class CountVowel {
       public static void main(String[] args) {
        String s = "Harsh";
        s = s.toLowerCase(); 
        int count = 0;

        for (int i = 0; i < s.length(); i++) { 
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++; 
            }
        }

        System.out.println("Vowel count: " + count);
    }
}

// Enhanced alternative using indexOf method:
// for (char ch : s.toLowerCase().toCharArray()) {
//     if ("aeiou".indexOf(ch) != -1) count++;
// }
