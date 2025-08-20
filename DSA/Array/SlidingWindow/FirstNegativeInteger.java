/*
 * Title: First Negative Integer in Every Window of Size K
 * Difficulty: Medium
 * Tags: Array, Sliding Window, Queue, Deque
 * Description:
 * Given an array of integers and a number k, find the first negative integer 
 * for each and every contiguous subarray of size k.
 * If a window does not contain a negative integer, then print 0 for that window.
 *
 * Example:
 * Input: arr = [12, -1, -7, 8, -15, 30, 16, 28], k = 3
 * Output: [-1, -1, -7, -15, -15, 0]
 *
 * Constraints:
 *  - 1 <= N <= 10^5
 *  - -10^5 <= arr[i] <= 10^5
 *  - 1 <= K <= N
 */


import java.util.*;
public class FirstNegativeInteger {
    public static int[] firstNegInt(int[] arr, int k) {
        List<Integer> res = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i <= (n - k); i++) {
            boolean found = false;
            // traverse through the current window
            for (int j = 0; j < k; j++) {
                
                // if a negative integer is found, then 
                // it is the first negative integer for 
                // the current window. Set the flag and break
                if (arr[i + j] < 0) {
                    res.add(arr[i + j]);
                    found = true;
                    break;
                }
            }
            // if the current window does not contain 
            // a negative integer
            if (!found) {
                res.add(0);
            }
        }
        return res.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        int[] res = firstNegInt(arr, k);
        System.out.print(Arrays.toString(res));
    }
}