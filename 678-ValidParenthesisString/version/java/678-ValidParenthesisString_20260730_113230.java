// Last updated: 7/30/2026, 11:32:30 AM
1class Solution {
2    public int maxSubArray(int[] nums) {
3
4        int max = nums[0];
5        int sum = 0;
6
7        for(int num : nums) {
8
9            sum += num;
10
11            max = Math.max(max, sum);
12
13            if(sum < 0)
14                sum = 0;
15        }
16
17        return max;
18    }
19}