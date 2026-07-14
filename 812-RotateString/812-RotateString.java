// Last updated: 7/14/2026, 2:22:04 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        // If lengths are different, impossible
        if (s.length() != goal.length()) {
            return false;
        }
        // Concatenate s with itself and check if goal is substring
        String doubled = s + s;
        return doubled.contains(goal);
    }
}