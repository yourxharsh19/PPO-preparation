/*
 * Title: Check if One String is Rotation of Another
 * Difficulty: Easy
 * Tags: String, Rotation, String Manipulation
 * Description:
 * Given two strings s1 and s2, determine whether s1 is a rotation of s2.
 * A string is considered a rotation of another string if it can be obtained
 * by shifting characters circularly.
 *
 * Example:
 * Input:
 * s1 = "abcd"
 * s2 = "cdab"
 * Output:
 * 1
 * Explanation:
 * "abcd" is a rotation of "cdab".
 *
 * Constraints:
 *  - 1 <= s1.length, s2.length <= 10^5
 *  - s1 and s2 consist of English letters only.
 *
 * Note:
 * If the lengths of the two strings are not equal, return -1.
 * Otherwise, concatenate s2 with itself and check if s1 is a substring.
 * Print 1 if true, otherwise print -1.
 */

import java.util.*;
public class CheckRotation {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s1,s2;
        s1=in.next();
        s2=in.next();
        if (s1.length() != s2.length()) {
            System.out.println(-1);
        }
        String doubled = s2 + s2;
        if (doubled.contains(s1)) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
        in.close();
    }
}

