// Last updated: 7/14/2026, 2:22:28 PM
class Solution {
    public int strongPasswordChecker(String password) {
        int n = password.length();
        boolean lower = false, upper = false, digit = false;

        // check character types
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) lower = true;
            if (Character.isUpperCase(c)) upper = true;
            if (Character.isDigit(c)) digit = true;
        }
        int missingTypes = 0;
        if (!lower) missingTypes++;
        if (!upper) missingTypes++;
        if (!digit) missingTypes++;

        // count repeating sequences and replacements
        int replace = 0;
        int oneMod = 0, twoMod = 0; // counts for repeats % 3 = 0,1
        for (int i = 0; i < n;) {
            int j = i;
            while (i < n && password.charAt(i) == password.charAt(j)) i++;
            int len = i - j;
            if (len >= 3) {
                replace += len / 3;
                if (len % 3 == 0) oneMod++;
                else if (len % 3 == 1) twoMod++;
            }
        }

        if (n < 6) {
            return Math.max(6 - n, missingTypes);
        } else if (n <= 20) {
            return Math.max(replace, missingTypes);
        } else {
            int deleteCount = n - 20;
            int toDelete = deleteCount;

            // use deletions to reduce replacements
            int reduce = Math.min(toDelete, oneMod * 1);
            replace -= reduce;
            toDelete -= reduce;

            reduce = Math.min(toDelete, twoMod * 2);
            replace -= reduce / 2;
            toDelete -= reduce;

            replace -= toDelete / 3;

            return deleteCount + Math.max(missingTypes, replace);
        }
    }
}
