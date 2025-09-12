// 🔹 Problem: Count Greater Elements

// You are given two arrays A and B. For each element in array B, determine how many elements in array A are strictly greater than it.

// Input Format

// The first line contains two integers n and m — the sizes of arrays A and B.

// The second line contains n integers — the elements of array A.

// The third line contains m integers — the elements of array B.

// Output Format

// Print m integers separated by spaces, where the i-th integer represents the number of elements in A that are strictly greater than B[i].

// Constraints

// 1 ≤ n, m ≤ 10^5

// -10^9 ≤ A[i], B[i] ≤ 10^9

package DSA.Array;

import java.util.Scanner;

public class CompareArray {
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        int[] A = new int[n];
        int[] B = new int[m];
        for(int i=0;i<n;i++){
            A[i]=in.nextInt();
        }
        for(int i=0;i<m;i++){
            B[i]=in.nextInt();
        }
   for(int i=0;i<B.length;i++){
       int count=0;
       for(int j=0;j<A.length;j++){
           if(B[i]<A[j]){
               count++;
           }
       }
      System.out.print(count +" ");
       }
       in.close();
    }
}
