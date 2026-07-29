// Last updated: 7/29/2026, 1:42:26 PM
1class Solution {
2    public int subarraySum(int[] nums, int k) {
3
4        int count = 0;
5
6        for (int i = 0; i < nums.length; i++) {
7            int sum = 0;
8
9            for (int j = i; j < nums.length; j++) {
10                sum+=nums[j];
11                if (sum == k) {
12                    count++;
13                }
14            }
15        }
16
17        return count;
18    }
19}