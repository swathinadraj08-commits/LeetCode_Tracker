// Last updated: 7/14/2026, 2:34:33 PM
class Solution {
    public int reverse(int x) {
        int rev=0;
        while(x!=0){
            int digit=0;
            digit=x%10;
            x=x/10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
            return 0;
            }
            rev=rev*10+digit;

        }
        return rev;

        
    }
}