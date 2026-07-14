// Last updated: 7/14/2026, 2:21:04 PM
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxLen = 0;
		
        for (String currSent : sentences) {
            int currLen = currSent.split(" ").length;
            if (maxLen < currLen)
                maxLen = currLen;
        }
        return maxLen;
    }
}
        
