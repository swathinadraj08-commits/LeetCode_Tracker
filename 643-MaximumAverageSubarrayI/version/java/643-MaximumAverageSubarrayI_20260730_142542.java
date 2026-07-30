// Last updated: 7/30/2026, 2:25:42 PM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int n=gain.length;
4        int altitute=0;
5        int high_alti=0;
6        for(int i=0; i<n; i++){
7            altitute+=gain[i];
8            if(altitute>high_alti){
9                high_alti=altitute;
10            }
11        }
12        
13        return high_alti;
14        
15    }
16}