
// 📌 Question: Maximum Subarray Sum

// You are given an integer array arr[] of size n.
// Your task is to find the maximum sum of a contiguous subarray within the given array.

// 🔹 Input

// First line contains an integer n (size of the array).

// Second line contains n space-separated integers (array elements).

// 🔹 Output

// Print a single integer — the maximum subarray sum.
package DSA.Array;

import java.util.Scanner;

public class MaximumSubarray {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += arr[j];
                maxSum = Math.max(maxSum, currentSum);
            }

        }
        System.out.println(maxSum);
        in.close();
     }    
}
