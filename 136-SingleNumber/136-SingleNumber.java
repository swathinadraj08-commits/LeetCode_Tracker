// Last updated: 7/14/2026, 2:33:52 PM
class Solution {
    public int singleNumber(int[] nums) {
        int r=0;
        for(int num: nums){
            r=r^num;

        }
        return r;
        
        
    }
}