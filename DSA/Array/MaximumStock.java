// 📌 Question: Maximum Profit from Stock Prices

// You are given an array arr[] of size n, where arr[i] represents the price of a stock on day i.
// You are allowed to buy the stock on one day and sell it on a later day.

// Your task is to determine the maximum profit you can achieve.
// If no profit can be made, return 0.

// 🔹 Input

// First line contains an integer n (number of days).

// Second line contains n space-separated integers, where each integer represents the stock price on that day.

// 🔹 Output

// Print a single integer — the maximum profit possible.

package DSA.Array;

import java.util.Scanner;

public class MaximumStock {
    public static void main (String args[]){
         Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int min = arr[0];
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            int profit = arr[i] - min;

            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }

        System.out.println(maxProfit);
        in.close();
    }
}
