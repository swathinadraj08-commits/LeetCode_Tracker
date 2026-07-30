// Last updated: 7/30/2026, 12:33:13 PM
1class Solution {
2    public int pivotIndex(int[] nums) {
3        int n=nums.length;
4        for(int i=0; i<n; i++){
5            int right=0;
6            int left=0;
7            for(int j=0; j<i; j++){
8                left+=nums[j];
9            }
10            for(int j=i+1; j<n; j++){
11                right+=nums[j];
12                
13            }
14            if(right==left){
15                return i;
16            }
17        }
18        return -1;
19    }
20}