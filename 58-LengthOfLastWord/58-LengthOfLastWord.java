// Last updated: 7/14/2026, 2:34:13 PM
class Solution {
    public int lengthOfLastWord(String s) {
        s=s.trim();
        int len=0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==' '){
                break;
            }
            else{
                len++;

            }
            
            
        }
        return len;



        
    }
}