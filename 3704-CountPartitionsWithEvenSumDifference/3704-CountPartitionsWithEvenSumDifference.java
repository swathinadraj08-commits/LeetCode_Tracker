// Last updated: 7/14/2026, 2:20:41 PM
class Solution {
    public int countPartitions(int[] nums) {
        int tsum = 0;
        for (int num : nums) {
            tsum += num;
        }

        int count = 0;
        int lsum = 0;

        for (int i = 0; i < nums.length - 1; i++) { // partition indices: 0 to n-2
            lsum += nums[i];
            int rsum = tsum - lsum;
            int dif = lsum - rsum;
            if (dif % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
