// Last updated: 7/14/2026, 2:21:53 PM
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int arr[]=new int[num_people];
        int give=1;
        int i=0;
        while(candies>0){
            int togive=Math.min(candies,give);
            arr[i%num_people]+=togive;
            candies=candies-togive;
            give++;
            i++;
        }
        return arr;
        
    }
}