// Last updated: 7/29/2026, 1:38:24 PM
1class Solution {
2    public int findMaxLength(int[] nums) {
3        int n=nums.length;
4        int maxlen=0;
5        HashMap<Integer,Integer> map=new HashMap<>();
6        map.put(0,-1);
7        int sum=0;
8        for(int i=0; i<n; i++){
9            if(nums[i]==0){
10                sum--;
11            }
12            else{
13                sum++;
14            }
15            if(map.containsKey(sum)){
16                int len=i-map.get(sum);
17                maxlen=Math.max(len,maxlen);
18            }
19            else{
20                map.put(sum,i);
21            }
22        }
23        return maxlen;
24        
25    }
26}