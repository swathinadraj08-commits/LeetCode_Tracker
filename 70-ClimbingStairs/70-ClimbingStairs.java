// Last updated: 7/14/2026, 2:34:10 PM
 class Solution {
    
    public int climbStairs(int n) {
        int arr[]=new int[n+2];
        fib(n+1,arr);
        return arr[n+1];

    }static int fib(int n,int[]arr) {
            if(n<=1) {
                arr[n]=n;
                return n;}
            if (arr[n] != 0) return arr[n];
   
            arr[n]=fib(n-1,arr)+fib(n-2,arr);
            return arr[n];
        
    }
 
        

}