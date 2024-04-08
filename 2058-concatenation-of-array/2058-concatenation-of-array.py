class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        n = len(nums)
        ans = []
        ans = [0 for i in range(n*2)]
        for i in range(n):
            ans[i] = nums[i]
            ans[i+n] = nums[i]
        return ans