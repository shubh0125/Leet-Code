class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        array=[]
        array = [0 for i in range(len(nums))] 
        for i in range(len(nums)):
            array[i] = nums[nums[i]]
        return array
