// Last updated: 8/4/2026, 12:37:30 PM
1import java.util.*;
2
3class Solution {
4    public List<Integer> findMissingElements(int[] nums) {
5
6        int min = nums[0];
7        int max = nums[0];
8
9        HashSet<Integer> set = new HashSet<>();
10
11        for (int num : nums) {
12            min = Math.min(min, num);
13            max = Math.max(max, num);
14            set.add(num);
15        }
16
17        List<Integer> ans = new ArrayList<>();
18
19        for (int i = min + 1; i < max; i++) {
20            if (!set.contains(i)) {
21                ans.add(i);
22            }
23        }
24
25        return ans;
26    }
27}