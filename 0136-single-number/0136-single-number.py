class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        nums.sort()
        l=len(nums)
        if (l==1):
            return nums[0]
        
        for i in range(1,l -1):
            if(i==1 and nums[i]!=nums[i-1]):
                return nums[i-1]
            elif(i==l-2 and nums[i]!=nums[i+1]):
                return nums[i+1]
            else:
                if(nums[i]!=nums[i-1] and nums[i]!=nums[i+1]):
                    return nums[i]
