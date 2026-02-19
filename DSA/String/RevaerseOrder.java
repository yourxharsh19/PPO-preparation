/*
      * Title: Reverse the Order of Words in a String
      * Difficulty: Easy            
      * Tags: String, Array, Iteration     
      * Description:
      * Given a string containing multiple words, reverse the order of the words.
      * Example:
      * Input: s = "I love Java"
      * Output: "Java love I"
      * Explanation: The words in the string are reversed in order.
      * Constraints:
      *  - 1 <= s.length <= 10^5                
      *  - s consists of English letters and spaces only.
      * Note:
      * The solution splits the string into words, reverses the order of the words, and joins them back into a single string.
*/
public class RevaerseOrder {
    public static void main(String[] args) {
        String s = "I love Java";

        String[] words = s.split(" ");

        String result = "";
        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i] + " ";
        }

        System.out.println(result.trim());
    }
}
