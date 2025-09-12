// 📌 Problem Statement

// You are given an array of integers of size n. Your task is to:

// Find the minimum element and the maximum element in the array along with their indices.

// Rearrange the array such that:

// First, include all the elements starting from the index of the smaller of the two (minimum or maximum) up to (but not including) the larger index.

// Then include all the elements that appear before the smaller index.

// Finally, include all the elements starting from the larger index up to the end of the array.

// Print the rearranged array.

// Input Format

// The first line contains an integer n — the number of elements in the array.

// The second line contains n integers — the elements of the array.

// Output Format

// Print the rearranged array elements separated by spaces.

package DSA.Array;

import java.util.*;
public class MinMax {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int min = arr[0];
        int max = arr[0];
        int imin = 0, imax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
                imin = i;
                
            }
            
            if (arr[i] > max) {
                max = arr[i];
                imax = i;
                
            }
            
        }
        int l=Math.min(imin,imax);
       int h=Math.max(imin,imax);

        List<Integer> answer = new ArrayList<>();

        for (int i = l; i < h; i++) {
            answer.add(arr[i]);
        }
        for (int i = 0; i < l; i++) {
            answer.add(arr[i]);
        }

        for (int i = h; i < arr.length; i++) {
            answer.add(arr[i]);
        }
        
        for (int x : answer) {
            System.out.print(x + " ");
        }
        in.close();
    }
}
