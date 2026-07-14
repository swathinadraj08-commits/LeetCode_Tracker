// Last updated: 7/14/2026, 2:22:29 PM
class Solution {
    public int thirdMax(int[] nums) {

        Integer lar = null;
        Integer sec = null;
        Integer third = null;

        for (int num : nums) {

            if ((lar != null && num == lar) ||
                (sec != null && num == sec) ||
                (third != null && num == third)) {
                continue;
            }

            if (lar == null || num > lar) {
                third = sec;
                sec = lar;
                lar = num;
            }

            else if (sec == null || num > sec) {
                third = sec;
                sec = num;
            }

            else if (third == null || num > third) {
                third = num;
            }
        }

        if (third == null) {
            return lar;
        }

        return third;
    }
}