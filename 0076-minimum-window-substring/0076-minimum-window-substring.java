class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int j = 0;
        int min = Integer.MAX_VALUE;
        int count = t.length();
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                if(map.get(ch)>0){
                count--;
                }
                map.put(ch, map.get(ch) - 1);     
            }
            while (count == 0) {
                if (i - j + 1 < min) {
                    min = i - j + 1;
                    start = j;
                }
                char left = s.charAt(j);
                if (map.containsKey(left)) {
                    map.put(left, map.get(left) + 1);
                    if (map.get(left) > 0) {
                        count++;
                    }
                }
                j++;
            }
        }
        return min == Integer.MAX_VALUE ? "" : s.substring(start, start + min);
    }
}