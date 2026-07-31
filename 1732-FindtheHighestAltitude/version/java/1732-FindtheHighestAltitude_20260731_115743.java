// Last updated: 7/31/2026, 11:57:43 AM
1import java.util.HashMap;
2
3class Solution {
4    public boolean checkSubarraySum(int[] nums, int k) {
5
6        HashMap<Integer, Integer> map = new HashMap<>();
7
8        // remainder 0 occurs before the array starts
9        map.put(0, -1);
10
11        int prefixSum = 0;
12
13        for (int i = 0; i < nums.length; i++) {
14
15            prefixSum += nums[i];
16
17            int rem = prefixSum % k;
18
19            // If this remainder has appeared before
20            if (map.containsKey(rem)) {
21
22                int prevIndex = map.get(rem);
23
24                // Subarray length should be at least 2
25                if (i - prevIndex >= 2) {
26                    return true;
27                }
28
29            } else {
30                // Store only the first occurrence
31                map.put(rem, i);
32            }
33        }
34
35        return false;
36    }
37}