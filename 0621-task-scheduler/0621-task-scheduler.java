class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[] =new int[26];
        int max=0;
        for(char task : tasks){
            freq[task-'A']++;
            max=Math.max(max,freq[task-'A']);
        }
        int maxcount=0;
        for(int f : freq){
            if(f==max){
                maxcount++;
            }
        }
        return Math.max(tasks.length, (max - 1) * (n + 1) + maxcount);
    }
}