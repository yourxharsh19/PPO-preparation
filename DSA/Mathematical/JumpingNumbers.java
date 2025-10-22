//Problem Statement: Jumping Numbers

// A Jumping Number is a number in which the difference between every two adjacent digits is exactly 1.
// For example:

// 7 (single-digit → always jumping)

// 8987 (differences: |8−9|=1, |9−8|=1, |8−7|=1 → valid)

// 4343456 (valid)

// 796 (invalid because |7−9|=2)

// You are given an integer N. Your task is to print all Jumping Numbers in the range [0, N] (inclusive), each on a new line.

// Input

// A single integer N (1 ≤ N ≤ 10⁵)

// Output

// Print all jumping numbers between 0 and N, one per line.
package DSA.Mathematical;
import java.util.*;

class JumpingNumbers
{
        public static boolean isJumping(int num) {
        if (num < 10) return true; 

        int prevDigit = num % 10;
        num /= 10;

        while (num > 0) {
            int currDigit = num % 10;
            if (Math.abs(currDigit - prevDigit) != 1) return false;
            prevDigit = currDigit;
            num /= 10;
        }

        return true;
    }


    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
       int n=in.nextInt();
       for(int i=0;i<=n;i++){
           if (isJumping(i)) {
                System.out.println(i);
           }
       }
       in.close();
    }
}