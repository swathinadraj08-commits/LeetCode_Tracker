// Last updated: 7/14/2026, 2:21:14 PM
class Solution {
    public boolean checkIfPangram(String sentence) {
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (sentence.indexOf(ch) == -1) {
                return false; // if any letter not found
            }
        }
        return true;
    }
}
