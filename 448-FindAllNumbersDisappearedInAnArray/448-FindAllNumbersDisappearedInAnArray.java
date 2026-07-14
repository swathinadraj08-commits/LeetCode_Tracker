// Last updated: 7/14/2026, 2:22:24 PM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n=nums.length;
        int count[]=new int[n+1];
        for(int i: nums){
            count[i]++;
        }
        List<Integer> result = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(count[i]==0){
                result.add(i);
            }
        }
        return result;
        
        
    }
}