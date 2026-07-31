// Last updated: 7/31/2026, 11:33:57 AM
1class NumArray {
2    int nums[];
3
4    public NumArray(int[] nums) {
5        this.nums=nums;
6        
7    }
8    
9    public int sumRange(int left, int right) {
10        int sum=0;
11        for(int i=left; i<=right; i++){
12            sum+=nums[i];
13
14        }
15        return sum;
16        
17    }
18}
19
20/**
21 * Your NumArray object will be instantiated and called as such:
22 * NumArray obj = new NumArray(nums);
23 * int param_1 = obj.sumRange(left,right);
24 */