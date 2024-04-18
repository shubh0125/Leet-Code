class Solution:
    def majorityElement(self, nums: List[int]) -> int:

        l = len(nums)
        if(l==1):
            return nums[0]
        
        hash = {}

        for i in nums:
            hash[i] = hash.get(i,0)+1
        
        for j in hash:
            if hash[j] > l//2:
                return j
            
        