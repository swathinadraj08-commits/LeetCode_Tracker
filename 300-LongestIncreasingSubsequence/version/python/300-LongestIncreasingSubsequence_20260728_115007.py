# Last updated: 7/28/2026, 11:50:07 AM
1class Solution(object):
2    def lengthOfLIS(self, nums):
3        n=len(nums)
4        dp=[1]*n
5        for i in range(n):
6            for j in range(i):
7                if nums[i]>nums[j]:
8                    dp[i]=max(dp[i],dp[j]+1)
9        return max(dp)
10
11        