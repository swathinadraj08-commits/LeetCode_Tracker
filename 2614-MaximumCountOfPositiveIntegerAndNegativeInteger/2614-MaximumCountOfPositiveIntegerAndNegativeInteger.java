// Last updated: 7/14/2026, 2:20:56 PM
class Solution {
    public int maximumCount(int[] nums) {
        int pcount=0;
        int ncount=0;
        for(int i: nums){
            if(i>0){
                pcount++;
            }
            else if(i<0) {
                ncount++;
            }
        }
        return Math.max(pcount,ncount);
        
    }
}