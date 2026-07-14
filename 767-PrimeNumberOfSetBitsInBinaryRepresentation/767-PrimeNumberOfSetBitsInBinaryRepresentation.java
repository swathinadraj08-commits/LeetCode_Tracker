// Last updated: 7/14/2026, 2:22:08 PM
class Solution {
    public int countPrimeSetBits(int left, int right) {
        boolean prime[]=new boolean[21];
        int primes[]={2,3,5,7,11,13,17,19};
        for(int p: primes){
            prime[p]=true;
        }
        int count=0;
        for(int i=left; i<=right; i++){
            int setbit=Integer.bitCount(i);
            if(prime[setbit]){
                count++;
            }

        }
        return count;
        
    }
}