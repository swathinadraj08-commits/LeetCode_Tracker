// Last updated: 7/14/2026, 2:20:54 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        int dsum=0;
        for(int i=0; i<nums.length; i++){
            sum=sum+nums[i];
        }
        for(int i=0; i<nums.length; i++){
            int num = nums[i]; 
            while(num >0) {
                int digit=num%10;
                dsum=dsum+digit;
                num=num/10;
            }
        }    

        return sum-dsum; 
           
        
    }
}