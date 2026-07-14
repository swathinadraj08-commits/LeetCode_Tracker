// Last updated: 7/14/2026, 2:22:23 PM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child=0;
        int cookie=0;
        while(child< g.length && cookie <s.length){
            if (s[cookie] >= g[child]) {
                // Cookie can satisfy the child
                child++;
            }
            cookie++; // Move to next cookie
        }

        return child; 

        
        
    }
}