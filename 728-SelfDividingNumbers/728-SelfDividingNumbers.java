// Last updated: 7/14/2026, 2:22:13 PM
import java.util.*;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        
        for (int num = left; num <= right; num++) {
            if (isSelfDividing(num)) {
                result.add(num);
            }
        }
        
        return result;
    }
    
    // Function to check if a number is self-dividing
    private boolean isSelfDividing(int n) {
        int original = n;
        
        while (n > 0) {
            int digit = n % 10;
            if (digit == 0 || original % digit != 0) {
                return false;
            }
            n = n / 10;
        }
        
        return true;
    }
}
