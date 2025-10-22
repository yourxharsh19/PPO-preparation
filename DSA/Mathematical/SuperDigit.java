// Problem Statement: Super Digit of a Number

// The super digit of a number is defined as follows:

// Start with an integer n.

// Concatenate it k times to form a new number p.

// Compute the sum of digits of p.

// If the sum has more than one digit, repeat the process until a single digit is obtained.

// The resulting single digit is called the super digit of the number.

// You are given integers n and k. Your task is to compute the super digit of the number formed.

// Input

// Two integers n and k (1 ≤ n ≤ 10¹⁰⁰⁰⁰⁰, 1 ≤ k ≤ 10⁵)

// Output

// Print a single integer — the super digit.
package DSA.Mathematical;
import java.util.*;
class SuperDigit
{
    public static int digitSum(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            temp = temp / 10;
        }
        return sum;
    }
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a = digitSum(n);
        a = a * k;
        while (a > 9) {
            a = digitSum(a);
        } 
        System.out.println(a);
            in.close();
    }
}

