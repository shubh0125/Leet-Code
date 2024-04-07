class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        
        res = -1
        l = len(needle)
        hl = len(haystack)
        for i in range(hl-l+1):
            if haystack[i:i+len(needle)] == needle:
                return i
        return -1