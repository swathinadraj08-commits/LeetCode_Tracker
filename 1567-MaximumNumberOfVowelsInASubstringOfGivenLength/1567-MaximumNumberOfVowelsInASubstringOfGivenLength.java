// Last updated: 7/14/2026, 2:21:27 PM
class Solution {
    public int maxVowels(String s, int k) {
        int count = 0;   // vowels in current window
        int max = 0;

        for (int i = 0; i < s.length(); i++) {
            // Add the rightmost character if it is a vowel
            char ch = s.charAt(i);
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
                count++;
            }

            // Remove the leftmost character if the window size > k
            if (i >= k) {
                char leftChar = s.charAt(i - k);
                if (leftChar=='a'||leftChar=='e'||leftChar=='i'||leftChar=='o'||leftChar=='u') {
                    count--;
                }
            }

            // Update max vowels seen
            max = Math.max(max, count);
        }

        return max;
    }
}
