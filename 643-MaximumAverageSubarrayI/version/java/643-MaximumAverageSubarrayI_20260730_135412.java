// Last updated: 7/30/2026, 1:54:12 PM
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        int n=nums.length;
4        double max=Integer.MIN_VALUE;
5        for(int i=0; i<=n-k; i++){
6            int sum=0;
7            for(int j=i; j<i+k; j++){
8                sum+=nums[j];
9            }
10            double avg=(double)sum/k;
11            if(avg>max){
12            max=avg;
13
14            }
15        }
16        return max;
17            
18        
19    }
20}