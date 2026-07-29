// Last updated: 7/29/2026, 2:22:49 PM
1class Solution {
2    public int minMoves2(int[] nums) {
3        Arrays.sort(nums);
4        int n=nums.length;
5        int med=nums[n/2];
6        int sum=0;
7        for(int i=0; i<n; i++){
8            sum+=Math.abs(nums[i]-med);
9        }
10        return sum;
11        
12    }
13}