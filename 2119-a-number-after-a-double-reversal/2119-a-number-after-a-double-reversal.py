class Solution:
    def isSameAfterReversals(self, num: int) -> bool:
        n=num
        s=0
        if(n==0):
            return True
        elif(n%10==0):
            return False
        return True
            
        