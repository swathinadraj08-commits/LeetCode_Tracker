// Last updated: 7/14/2026, 2:22:20 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num<=1)return false;
        int sum=1;
        for(int i=2; i<num; i++){
            if(num%i==0){
                sum=sum+i;

            }
        }
        return sum==num;
        
    }
}