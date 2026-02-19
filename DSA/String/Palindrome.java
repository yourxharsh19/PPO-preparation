/*
      * Title: Check if a String is a Palindrome      
      * Difficulty: Easy
      * Tags: String, Two Pointers
      * Description:
      * Given a string, check if it reads the same forwards and backwards (palindrome).
      * Example:
      * Input: s = "level"
      * Output: Palindrome
      * Explanation: The string "level" reads the same forwards and backwards.
      * Constraints:
      *  - 1 <= s.length <= 10^5
      *  - s consists of English letters only.
      * Note:
      * The solution uses two pointers to compare characters from the start and end of the string.
*/
public class Palindrome {
    public static void main(String[] args) {
        String s = "level";
        boolean isPalindrome = true;

        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

