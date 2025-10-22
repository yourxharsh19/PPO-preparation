// Problem Statement: Armstrong Numbers in a Range

// An Armstrong number (also called a narcissistic number) of order n is a number that is equal to the sum of its own digits each raised to the power of n, where n is the total number of digits in the number.

// For example:

// 153 → 1³ + 5³ + 3³ = 153 ✔️

// 9474 → 9⁴ + 4⁴ + 7⁴ + 4⁴ = 9474 ✔️

// 123 → 1³ + 2³ + 3³ = 36 ❌

// You are given two integers L and U. Your task is to find and print all Armstrong numbers in the range [L, U] (inclusive).
// If no Armstrong number exists in the given range, print -1.

// Input

// Two integers L and U (1 ≤ L ≤ U ≤ 10⁶)

// Output

// Print all Armstrong numbers between L and U, one per line.

// If none exist, print -1.
package DSA.Mathematical;
import java.util.*;

class Armstrong
{
    public static boolean arm(int num) {
        int sum = 0;
        int org = num;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == org;
    }
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int u = in.nextInt();
        boolean found = false;
        for (int i = l; i <= u; i++) {
            if (arm(i)) {
                System.out.println(i);
                found = true;
            }
        }
        if (!found) {
            System.out.print("-1");
        }
        in.close();
    }
}