// Last updated: 7/14/2026, 2:33:42 PM
class Solution {
    public boolean isHappy(int n) {
        if(n<=0) return false;
        
        Set<Integer> seen =new HashSet<>();
        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            int sum=0;
            while(n>0){
                int dig=n%10;
                int sqr=dig*dig;
                sum=sum+sqr;
                n=n/10;
        }
        n=sum;
        
        } 
        return n==1;
        
    }
}