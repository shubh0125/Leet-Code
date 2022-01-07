class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        count=0
        for x in nums:
            if x == val:
                count+=1
        for x in range(0,count):
            nums.remove(val)