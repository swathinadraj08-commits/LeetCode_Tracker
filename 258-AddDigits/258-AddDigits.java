// Last updated: 7/14/2026, 2:23:30 PM
class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(num>=10){
            sum=0;
            while(num>0){
               int digit=num%10;
               sum+=digit;
               num=num/10;
            }
            num=sum;

        }
        return num;
        
        
        
        
    }
}