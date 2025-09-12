// 📌 Question: Next Greater Element (NGE)

// You are given an array of integers of size n. For each element in the array, find the next greater element to its right.

// The next greater element of an element x is the first element that appears after x in the array and is strictly greater than x.

// If no such element exists, print 0 for that position.

// 🔹 Input

// The first line contains an integer n (size of the array).

// The second line contains n integers, representing the elements of the array.

// 🔹 Output

// Print n integers (without spaces or with spaces, depending on formatting) where the i-th integer represents the next greater element of arr[i].

package DSA.Array;
import java.util.Scanner;
public class NextGreaterRight {
    public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int result = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    result = arr[j];
                    break;
                }
            }
            System.out.print(result);
        }
        in.close();
    }
}
