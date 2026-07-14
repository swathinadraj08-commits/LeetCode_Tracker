// Last updated: 7/14/2026, 2:23:26 PM
class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
         int fact[]={2,3,5};
         for(int f: fact){
            while(n%f==0){
                n=n/f;
            }
         }
        return n==1;
                
          

        
    }
}