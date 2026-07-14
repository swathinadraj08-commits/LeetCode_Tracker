// Last updated: 7/14/2026, 2:21:36 PM
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] target = new int[nums.length];
        int size = 0; // keeps track of current filled elements
        
        for (int i = 0; i < nums.length; i++) {
            // Shift elements to the right from index[i]
            for (int j = size; j > index[i]; j--) {
                target[j] = target[j - 1];
            }
            target[index[i]] = nums[i];
            size++;
        }
        return target;
    }
}
