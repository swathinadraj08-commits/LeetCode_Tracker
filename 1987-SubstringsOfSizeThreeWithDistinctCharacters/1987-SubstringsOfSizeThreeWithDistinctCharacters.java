// Last updated: 7/14/2026, 2:21:13 PM
class Solution {
    public int countGoodSubstrings(String s) {
        int count=0;
        int k=3;
        for(int i=0; i<=s.length()-3; i++){
            char ch=s.charAt(i);
            char ch1=s.charAt(i+1);
            char ch2=s.charAt(i+2);
            if(ch!=ch1 && ch!=ch2 && ch1!=ch2){
                count++;
            }

            

        }
        return count;
        
    }
}