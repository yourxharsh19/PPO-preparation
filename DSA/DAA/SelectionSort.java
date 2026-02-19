//selection sort
package DSA.DAA;
import java.util.*;
public class SelectionSort{
      public static void main (String args[]){
          Scanner in = new Scanner(System.in);
          int arr[]={5,4,3,2,1};
          int n=arr.length;
          for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
            for(int i=0;i<n;i++){
                  System.out.println(arr[i]+" ");
            }
         in.close();
    }
 }