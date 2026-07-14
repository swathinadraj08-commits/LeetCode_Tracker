// Last updated: 7/14/2026, 2:21:39 PM
class Solution {
    public int countNegatives(int[][] grid) {
        int c=0;
        for(int[] row:grid){
            for(int num: row){
                if(num<0){
                 c++;

            }
            


            }
           
        }
        return c;
        
    }
}