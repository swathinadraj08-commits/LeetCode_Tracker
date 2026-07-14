// Last updated: 7/14/2026, 2:21:25 PM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int arr[]=new int[nums.length];
        int index=0;
        for(int i=0; i<n; i++){
            arr[index]=nums[i];
            arr[index+1]=nums[i+n];
            index=index+2;
        }
        return arr;
        
    }
}