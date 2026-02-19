/*
 * Title: Insert a String at Every Nth Position
 * Difficulty: Medium
 * Tags: String, StringBuilder, Iteration
 * Description:
 * Given a main string s1, a substring s2, and an integer n,
 * insert s2 into s1 at every nth index position.
 *
 * Example:
 * Input:
 * s1 = "abcdef"
 * s2 = "X"
 * n = 2
 *
 * Output:
 * abXcdXef
 *
 * Explanation:
 * Starting from index 2, the substring "X" is inserted.
 * After each insertion, the index moves forward by (n + 1)
 * to account for the newly inserted substring.
 *
 * Constraints:
 *  - 1 <= s1.length <= 10^5
 *  - 1 <= s2.length <= 10^5
 *  - 0 <= n <= s1.length
 *  - Strings consist of valid characters.
 *
 * Note:
 * StringBuilder is used for efficient insertion,
 * since strings in Java are immutable.
 */

import java.util.*;

class InsertatIndex{
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
		String s1=in.nextLine();
		String s2=in.next();
		int n=in.nextInt();
		StringBuilder sb= new StringBuilder(s1);
		for(int i=n;i<sb.length();i=i+n+1){
		    sb.insert(i,s2);
		}
		String s=sb.toString();
		System.out.print(s);
           in.close();
	}
}
