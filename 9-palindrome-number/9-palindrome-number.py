class Solution:
    def isPalindrome(self, x: int) -> bool:
        n=x
        s=0
        if(x<0):
            return False
        while(n!=0):
            temp=n%10
            n=n//10
            s=s*10+temp
        if(s==x):
            return True
        else:
            return False