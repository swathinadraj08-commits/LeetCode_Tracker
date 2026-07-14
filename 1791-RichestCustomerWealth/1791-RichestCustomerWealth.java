// Last updated: 7/14/2026, 2:21:16 PM
class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int[] arr:accounts){
            int sum=0;
            for(int a:arr){
                sum+=a;
                max=Math.max(max,sum);
            }
        }
        return max;
    }
}