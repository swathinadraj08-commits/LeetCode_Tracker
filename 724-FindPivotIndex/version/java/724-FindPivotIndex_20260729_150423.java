// Last updated: 7/29/2026, 3:04:23 PM
1class Solution {
2    public int[] runningSum(int[] nums) {
3        for(int i=1; i<nums.length; i++){
4            nums[i]=nums[i]+nums[i-1];
5        }
6        return nums;
7        
8    }
9}