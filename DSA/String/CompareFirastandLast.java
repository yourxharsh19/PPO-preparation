/*
      * Title: Compare First and Last Character of a String
      * Difficulty: Easy            
      * Tags: String, Iteration     
      * Description:
      * Given a string, check if the first and last characters are the same.
      * Example:
      * Input: s = "level"
      * Output: true
      * Explanation: The first and last characters are both 'l'.
      * Constraints:
      *  - 1 <= s.length <= 10^5                
      *  - s consists of English letters only.
      * Note:
      * The solution compares the first and last characters of the string directly.
*/
public class CompareFirastandLast {
    public static void main(String[] args) {
        String s = "level";

        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            System.out.println("true");
        } 
        else {
            System.out.println("false");
        }
    }
}
