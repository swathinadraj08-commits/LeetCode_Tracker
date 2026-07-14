// Last updated: 7/14/2026, 2:22:32 PM
class Solution {
    public int longestPalindrome(String s) {
        int[] freq = new int[128];  // For all ASCII characters
        
        // Count occurrences
        for (char c : s.toCharArray()) {
            freq[c]++;
        }
        
        int length = 0;
        boolean hasOdd = false;
        
        for (int count : freq) {
            if (count % 2 == 0) {
                length += count;         // use full even count
            } else {
                length += count - 1;     // use even part
                hasOdd = true;           // mark that an odd exists
            }
        }
        
        if (hasOdd) length += 1;  // one odd can go in the center
        
        return length;
    }
}
