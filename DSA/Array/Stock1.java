// Problem: Best Time to Buy and Sell Stock
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Difficulty: Easy
// Time Complexity: O(n)
// Space Complexity: O(1)

package DSA.Array;

public class Stock1 {
      public int maxProfit(int[] prices) {
        int max=0;
        int min=prices[0];
         for(int i=0;i<prices.length;i++){
            int profit = prices[i]- min;
            if(profit>max){
                max=profit;
            }   
            if(prices[i]< min){
                min=prices[i];
            }
         }
         return max;
    }
}
