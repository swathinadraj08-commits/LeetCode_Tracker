// Last updated: 7/14/2026, 2:33:38 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
        
    }
}