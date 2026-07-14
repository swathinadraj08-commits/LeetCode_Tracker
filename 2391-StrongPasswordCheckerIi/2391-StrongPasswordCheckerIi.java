// Last updated: 7/14/2026, 2:20:58 PM
class Solution {
    public boolean strongPasswordCheckerII(String password) {
        int n = password.length();

        // 1. Check length requirement.
        if (n < 8) {
            return false;
        }

        boolean lower = false;
        boolean upper = false;
        boolean number = false;
        boolean spl = false;
        String specialChars = "!@#$%^&*()-+";

        for (int i = 0; i < n; i++) {
            char ch = password.charAt(i);

            // 2. Check for consecutive characters.
            if (i > 0 && ch == password.charAt(i - 1)) {
                return false;
            }

            // 3. Check for character types.
            if (Character.isUpperCase(ch)) {
                upper = true;
            } else if (Character.isLowerCase(ch)) {
                lower = true;
            } else if (Character.isDigit(ch)) {
                number = true;
            } else if (specialChars.indexOf(ch) != -1) {
                spl = true;
            }
        }

        // 4. Return true only if all boolean flags are true.
        return lower && upper && number && spl;
    }
}
