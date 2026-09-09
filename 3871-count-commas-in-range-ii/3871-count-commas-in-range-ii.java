class Solution {
    public long countCommas(long n) {
        long count=0;
        long v=1000;
        while(v<=n){
            count+=(n-v+1);
            v*=1000;
        }
        return count;
    }
}