// Last updated: 7/14/2026, 2:21:58 PM
class Solution {
    public int fib(int n) {
        if(n<=1){
            return n;
        }
        int a=0, b=1;
        for(int i=2; i<=n; i++){
            int t=b;
            b=a+b;
            a=t;
        }
        return b;
        
        
        
    }
}