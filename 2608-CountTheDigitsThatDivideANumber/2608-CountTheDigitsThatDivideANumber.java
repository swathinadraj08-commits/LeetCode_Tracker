// Last updated: 7/14/2026, 2:20:57 PM
class Solution {
    public int countDigits(int num) {
        int org=num;
        int sum=0;
        int c=0;
        while(num>0){
            int dig=num%10;
            if(org%dig==0 && dig!=0){
                sum=sum+dig;          
                c++;
            }
             num=num/10;
            

        }
        return c;

        
    }
}