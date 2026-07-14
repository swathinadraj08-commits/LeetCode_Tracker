// Last updated: 7/14/2026, 2:22:22 PM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                    count++;
            }
            else{
                count=0;
            }
                
            if(count > maxCount){
                maxCount = count;
                
            }
        }


        return maxCount;
        
    }
}