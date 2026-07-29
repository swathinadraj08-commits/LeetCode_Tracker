// Last updated: 7/29/2026, 5:54:53 PM
1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        HashMap<Integer,Boolean>map=new HashMap<>();
4        for(int num :nums){
5            if(map.containsKey(num)){
6                return true;
7            }
8            else{
9                map.put(num,true);
10            }
11        }
12        return false;
13        
14    }
15}