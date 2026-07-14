// Last updated: 7/14/2026, 2:20:49 PM
class Solution {
    public String finalString(String s) {
        StringBuilder screen = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == 'i') {
                screen.reverse();        // reverse the current text
            } else {
                screen.append(c);        // add normally
            }
        }

        return screen.toString();
    }
}
