// Last updated: 7/14/2026, 2:34:04 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int k=0; 
        for(int i=m; i<m+n; i++){
            nums1[i]=nums2[k];
            k++;
        }
        Arrays.sort(nums1);
        
        
    }
}