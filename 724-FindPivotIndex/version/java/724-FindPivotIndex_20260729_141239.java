// Last updated: 7/29/2026, 2:12:39 PM
1class Solution {
2    public int minMoves(int[] nums) {
3        Arrays.sort(nums);
4        int sum=0;
5        int tar=nums[0];
6        for(int i=0; i<nums.length; i++){
7            sum+=nums[i]-tar;
8
9        }
10        return sum;
11        
12    }
13}