package DSA.DAA;
public class CountingSort {
      public static void main(String[] args) {
            int[] arr = {3, 5, 7, 9, 11};
            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                  if (arr[i] > max) {
                        max = arr[i];
                  }
            }
            int[] count = new int[max + 1];
            for (int i = 0; i < arr.length; i++) {
                  count[arr[i]]++;
            }
            int index = 0;
            for (int i = 0; i < count.length; i++) {
                  for (int j = 0; j < count[i]; j++) {
                        arr[index++] = i;
                  }
            }
            for (int i = 0; i < arr.length; i++) {
                  System.out.println(arr[i] + " ");
            }
      }
}
