// Last updated: 8/4/2026, 12:16:28 PM
1class Solution {
2    public int minFlipsMonoIncr(String s) {
3
4        int ones = 0;
5        int flips = 0;
6
7        for (char ch : s.toCharArray()) {
8
9            if (ch == '1') {
10                ones++;
11            } else {
12                // ch == '0'
13                flips = Math.min(flips + 1, ones);
14            }
15        }
16
17        return flips;
18    }
19}