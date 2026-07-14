// Last updated: 7/14/2026, 2:21:18 PM
class Solution {
    public int xorOperation(int n, int start) {
        int result=0;
        for (int i = 0; i < n; i++) {
            int num = start + 2 * i; // generate nums[i]
            result =result ^num;           // XOR with result
        }
        return result;

        
    }
}