// Last updated: 7/14/2026, 2:21:07 PM
class Solution {
    public int countQuadruplets(int[] nums) {
        int c=0;
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    for (int l = k + 1; l < nums.length; l++) {
                       if(nums[i]+nums[j]+nums[k]==nums[l]){
                        c++;
                       }                 
                    }          
                }
            }
        }
        return c;
       
    }
}