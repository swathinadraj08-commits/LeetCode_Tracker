// Last updated: 7/14/2026, 2:22:46 PM
class Solution {
    public int firstUniqChar(String s) {
        s=s.toLowerCase();
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if (s.indexOf(ch) == s.lastIndexOf(ch)){
               
              return i;
            }
           
                

        }
        return -1;
            

        
    }
}