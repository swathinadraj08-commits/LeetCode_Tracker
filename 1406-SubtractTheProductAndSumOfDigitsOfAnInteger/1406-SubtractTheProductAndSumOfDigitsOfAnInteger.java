// Last updated: 7/14/2026, 2:21:42 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0;
        int pro=1;
        while(n>0){
            int digit;
            digit=n%10;
            sum=sum+digit;
            pro=pro*digit;
            n=n/10;
            
        }
        return pro-sum;
        
        
        
    }
}