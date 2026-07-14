// Last updated: 7/14/2026, 2:33:54 PM
class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int max=0;
        for(int pri : prices){
            if(pri<minprice) {
            minprice=pri;
            } 
            else {
                max = Math.max(max, pri - minprice); // check profit
            }
        }

        return max;
        

        
    }
}