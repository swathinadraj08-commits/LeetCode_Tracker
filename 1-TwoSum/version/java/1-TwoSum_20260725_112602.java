// Last updated: 7/25/2026, 11:26:02 AM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int n=nums.length;
4        HashMap<Integer,Integer> number=new HashMap<>();
5        for(int i=0; i<n; i++){
6            int c=target-nums[i];
7            if(number.containsKey(c)){
8                return new int[] {number.get(c),i};
9            }
10            number.put(nums[i],i);
11        }
12        return new int[]{};
13        
14        
15    }
16}