// Last updated: 7/14/2026, 2:23:24 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int res=n*(n+1)/2;
        int sum=0;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];

        }
        return res-sum;
        
    }
}