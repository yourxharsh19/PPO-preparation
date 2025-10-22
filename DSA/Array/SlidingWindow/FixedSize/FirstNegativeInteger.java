// First negative in every window of size k
// Difficulty: MediumAccuracy: 48.61%Submissions: 209K+Points: 4Average Time: 15m

// Given an array arr[]  and a positive integer k, find the first negative integer for each and every window(contiguous subarray) of size k.

// Note: If a window does not contain a negative integer, then return 0 for that window.

// Examples:

// Input: arr[] = [-8, 2, 3, -6, 10] , k = 2
// Output: [-8, 0, -6, -6]
// Explanation:
// Window [-8, 2] First negative integer is -8.
// Window [2, 3] No negative integers, output is 0.
// Window [3, -6] First negative integer is -6.
// Window [-6, 10] First negative integer is -6.
// Constraints:
// 1 <= arr.size() <= 106
// -105 <= arr[i] <= 105
// 1 <= k <= arr.size()

import java.util.*;
public class FirstNegativeInteger {
   static List<Integer> firstNegInt(int arr[], int k) {
        ArrayList <Integer> negative =new ArrayList<>();
        List <Integer> ans =new ArrayList<>();
        int WindowStart=0;
        int WindowEnd=0;
        
        while(WindowEnd<arr.length){
            if(arr[WindowEnd]<0){
                negative.add(arr[WindowEnd]);
            }
            if((WindowEnd-WindowStart+1)<k){
                WindowEnd++;
            }
           else if((WindowEnd-WindowStart+1)==k){
                if(negative.isEmpty()){
                    ans.add(0);
                }
                else{
                    ans.add(negative.get(0));
                }
                
                if (!negative.isEmpty() && arr[WindowStart] == negative.get(0)) {
                       negative.remove(0);
                      }

                WindowEnd++;
                WindowStart++;
            }
            else{
                WindowStart++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
         int arr[] = {-8, 2, 3, -6, 10};
         int k = 2;
         List<Integer> result = firstNegInt(arr, k);
         System.out.println(result);
    }
}
