class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:

        ans = ""
        str = sorted(strs)
        first = str[0]
        last = str[-1]
        

        for i in range(min(len(first),len(last))):
            if(first[i]!=last[i]):
                return ans
            ans = ans + first[i]
        return ans
            