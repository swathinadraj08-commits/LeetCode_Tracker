// Last updated: 7/14/2026, 2:22:55 PM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq = new int[26];

        // Count characters in magazine
        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }

        // Check characters for ransomNote
        for (char c : ransomNote.toCharArray()) {
            freq[c - 'a']--;
            if (freq[c - 'a'] < 0) {
                return false;   // not enough characters
            }
        }

        return true;
    }
}
