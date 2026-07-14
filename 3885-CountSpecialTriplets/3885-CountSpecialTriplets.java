// Last updated: 7/14/2026, 2:20:39 PM
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int specialTriplets(int[] nums) {
        int mod = 1_000_000_007;
        int n = nums.length;
        long count = 0;

        // Maps to store frequency of numbers before and after j
        Map<Integer, Long> freqLeft = new HashMap<>();
        Map<Integer, Long> freqRight = new HashMap<>();

        // Fill freqRight with all numbers initially
        for (int num : nums) {
            freqRight.put(num, freqRight.getOrDefault(num, 0L) + 1);
        }

        // Loop through each element as middle j
        for (int j = 0; j < n; j++) {
            int target = nums[j] * 2;

            // Remove current j from right map
            freqRight.put(nums[j], freqRight.get(nums[j]) - 1);

            // Count of i before j and k after j
            long countLeft = freqLeft.getOrDefault(target, 0L);
            long countRight = freqRight.getOrDefault(target, 0L);

            // Add contribution of this j
            count = (count + (countLeft * countRight) % mod) % mod;

            // Add current j to left map
            freqLeft.put(nums[j], freqLeft.getOrDefault(nums[j], 0L) + 1);
        }

        return (int) count;
    }
}
