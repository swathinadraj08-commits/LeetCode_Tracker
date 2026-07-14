// Last updated: 7/14/2026, 2:22:26 PM
class Solution {
    public int arrangeCoins(int n) {
        long coins = n;  // use long to avoid overflow
        return (int)((Math.sqrt(1 + 8 * coins) - 1) / 2);
    }
}
