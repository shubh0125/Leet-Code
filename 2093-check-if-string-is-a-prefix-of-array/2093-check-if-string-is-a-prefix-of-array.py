class Solution:
    def isPrefixString(self, s: str, words: List[str]) -> bool:
        subresult = [''.join(words[:i+1]) for i in range(len(words))]
        for substr in subresult:
            if substr == s: return True
        return False
        