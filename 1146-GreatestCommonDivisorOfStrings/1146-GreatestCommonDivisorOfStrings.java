// Last updated: 7/14/2026, 2:21:54 PM
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        // Step 1: Check if a common string exists
        if (!(str1 + str2).equals(str2 + str1)) {
            return ""; // no common divisor
        }

        // Step 2: Find GCD of lengths
        int gcdLength = gcd(str1.length(), str2.length());

        // Step 3: Return substring of length gcdLength
        return str1.substring(0, gcdLength);
    }

    // Euclidean algorithm for GCD
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
