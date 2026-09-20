class Solution {
    public int reverseDegree(String s) {
         int sum=0;
         int  n=s.length();
        for(int i=0; i<n; i++) {
            sum+=(i+1)*('z'-s.charAt(i)+1);
        }
        return sum;
    }
}