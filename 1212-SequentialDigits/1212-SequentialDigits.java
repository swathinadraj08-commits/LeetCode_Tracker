// Last updated: 7/14/2026, 2:21:49 PM
import java.util.*;

class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> result = new ArrayList<>();
        String digits = "123456789";

        int lenLow = String.valueOf(low).length();
        int lenHigh = String.valueOf(high).length();

        for (int length = lenLow; length <= lenHigh; length++) {
            for (int start = 0; start + length <= digits.length(); start++) {
                int num = Integer.parseInt(digits.substring(start, start + length));
                if (num >= low && num <= high) {
                    result.add(num);
                }
            }
        }

        return result;
    }
}
