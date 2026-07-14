// Last updated: 7/14/2026, 2:22:02 PM
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // We are in the descending part, peak is at mid or left side
                right = mid;
            } else {
                // arr[mid] < arr[mid + 1], ascending part → peak is to the right
                left = mid + 1;
            }
        }
        // left == right is peak index
        return left;
    }
}
