class Solution:
    def generate(self, n: int) -> List[List[int]]:
        final=[]
        
        for i in range(1,n + 1):
            if i == 1:
                final.append([1])
            elif i == 2:
                final.append([1,1])
            else:
                m = 1
                mid=[]
                for j in range(1,i + 1):
                    mid.append(m)
                    # print(m, end = " ")
                    m = int(m * (i - j) / j)  
                final.append(mid)
        return final