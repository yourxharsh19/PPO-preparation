// Problem: Swap Alternate Blocks
// Problem Statement

// You are given an array of size n and an integer k. Divide the array into contiguous blocks of size k. For every two consecutive blocks, swap their elements.

// If the last block does not have a pair to swap with, leave it unchanged.

// Input

// The first line contains two integers n (size of the array) and k.

// The second line contains n space-separated integers, the elements of the array.

// Output

// Print the array after performing the block-wise swaps.

// Constraints

// 1 ≤ n ≤ 10^5

// 1 ≤ k ≤ n

// 1 ≤ arr[i] ≤ 10^9
package DSA.Array;

import java.util.Scanner;

public class swap {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=in.nextInt();
		}
		for(int i=0;i<n;i+=2*k){
		    for(int j=0;j<k;j++){
		        int temp=arr[i+j];
		        arr[i+j]=arr[i+j+k];
		        arr[i+j+k]=temp;
		    }
		}
		for(int i=0;i<n;i++){
		    System.out.print(arr[i] + " ");
		}
		in.close();
    }
}
