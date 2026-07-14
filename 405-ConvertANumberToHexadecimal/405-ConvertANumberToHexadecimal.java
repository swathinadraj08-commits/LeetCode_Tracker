// Last updated: 7/14/2026, 2:22:33 PM
class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";

        char[] hex = "0123456789abcdef".toCharArray();
        StringBuilder result = new StringBuilder();

        // Process up to 8 hex digits (32 bits)
        while (num != 0) {
            int last4Bits = num & 15;      // Extract last 4 bits
            result.append(hex[last4Bits]);
            num >>>= 4;                    // Unsigned right shift
        }

        return result.reverse().toString();
    }
}
