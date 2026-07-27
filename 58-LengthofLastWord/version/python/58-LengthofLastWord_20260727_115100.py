# Last updated: 7/27/2026, 11:51:00 AM
1class Solution(object):
2    def lengthOfLastWord(self, s):
3        words=s.strip().split()
4        if not words:
5            return 0
6        return len(words[-1])
7    
8        