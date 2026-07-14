// Last updated: 7/14/2026, 2:20:50 PM
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int out=0;
        for(int i=0; i<hours.length; i++){
            if(hours[i]>=target ){
                out=out+1;

            }
      

        }
        return out;
        
    }
}