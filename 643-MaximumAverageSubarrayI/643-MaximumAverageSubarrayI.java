// Last updated: 7/14/2026, 2:22:15 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int wsum=0;
        for(int i=0; i<k; i++){
            wsum=wsum+nums[i];
            wsum=wsum;
        }
        int maxs=wsum;
        for(int i=k; i<nums.length; i++){
            wsum=wsum-nums[i-k]+nums[i];
            maxs=Math.max(wsum,maxs);
        }
        return (double) maxs/k;
        
    }
}