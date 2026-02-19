/*
 * Title: Remove Special Characters from a String
 * Difficulty: Easy
 * Tags: String, Regular Expression, String Manipulation
 * Description:
 * Given an input string s, return the string after removing
 * all characters except alphabets (a-z, A-Z), digits (0-9),
 * and spaces.
 *
 * Example:
 * Input:
 * s = "Hello@123 World!!"
 *
 * Output:
 * Hello123 World
 *
 * Explanation:
 * Special characters '@' and '!!' are removed.
 * Only letters, numbers, and spaces are retained.
 *
 * Constraints:
 *  - 1 <= s.length <= 10^5
 *  - The string may contain letters, digits, spaces,
 *    and special characters.
 *
 * Note:
 * The solution uses a regular expression:
 * "[^a-zA-Z0-9\\s]"
 * which matches any character that is NOT a letter,
 * digit, or whitespace, and replaces it with an empty string.
 */

import java.util.*;
public class RemoveSpecialCharacter {
 public static void main(String[] args) {
    Scanner in = new Scanner(System.in); 
    String s = in.nextLine();
    s = s.replaceAll("[^a-zA-Z0-9\\s]", "");
    System.out.println(s);
    in.close();
 }
}
