package DSA.DAA;

public class ShellSort {
      public static void shellSort(int[] arr) {
        int n = arr.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {

            // Do a gapped insertion sort for this gap size
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j = i;

                // Shift earlier gap-sorted elements until correct position found
                while (j >= gap && arr[j - gap] > temp) {
                    arr[j] = arr[j - gap];
                    j -= gap;
                }

                // Put temp at its correct position
                arr[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};

        shellSort(arr);

        System.out.println("Sorted array:");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
