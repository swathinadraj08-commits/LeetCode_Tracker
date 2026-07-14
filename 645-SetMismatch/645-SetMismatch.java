// Last updated: 7/14/2026, 2:22:14 PM
class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int count[]=new int[n+1];
        for(int i:nums){
            count[i]++;
        }
        int dupli=0;
        int miss=0;
        for(int i=0; i<=n; i++){
            if(count[i]==2){
                 dupli=i;
            }
            if(count[i]==0){
                 miss=i;
            }
        }
        return new int[]{dupli,miss};

        
    }
}