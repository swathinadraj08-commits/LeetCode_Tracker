// Last updated: 7/14/2026, 2:23:03 PM
class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            // Move left pointer to next vowel
            while (left < right && !isVowel(arr[left])) {
                left++;
            }

            // Move right pointer to previous vowel
            while (left < right && !isVowel(arr[right])) {
                right--;
            }

            // Swap vowels
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        return new String(arr);
    }

    // Helper method to check if a character is a vowel
    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
