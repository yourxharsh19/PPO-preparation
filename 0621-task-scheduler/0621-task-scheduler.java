class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        int max = 0;
        for (char c : tasks) {
            freq[c - 'A']++;
        }
        for (int i = 0; i < freq.length; i++) {
            max = Math.max(max, freq[i]);
        }
        int count = 0;
        for (int f : freq) {
            if (f == max) {
                count++;
            }
        }
        int result = Math.max(tasks.length, (max - 1) * (n + 1) + count);

        return result;

    }
}