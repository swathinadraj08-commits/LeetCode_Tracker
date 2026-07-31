// Last updated: 7/31/2026, 2:20:03 PM
1class Solution {
2    public int thirdMax(int[] nums) {
3        nums = Arrays.stream(nums).distinct().toArray();
4        int n=nums.length;
5        Arrays.sort(nums);
6        if(n<3){
7            return nums[n-1];
8        }
9        return nums[n-3];
10    }
11}
12
13