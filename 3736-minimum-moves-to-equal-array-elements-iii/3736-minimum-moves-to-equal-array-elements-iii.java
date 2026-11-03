class Solution {
    public int minMoves(int[] nums) {
        int mx = Integer.MIN_VALUE;
        for (int x : nums) {
            mx = Math.max(mx, x);
        }
        int res = 0;
        for (int x : nums) {
            res += (mx - x);
        }
        return res;
    }
}