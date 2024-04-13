class Solution:
    def getRow(self, rowIndex: int) -> List[int]:
        pas=[[1],[1,1]] # Pas means Pascal's Triangle
        if rowIndex>1:
            for i in range(rowIndex-1):
                curr=[1]    #curr means current row
                last=pas[-1] # last means previous row 
                for i in range(len(last)-1):
                    curr.append(last[i]+last[i+1])
                curr.append(1)
                pas.append(curr)
        return pas[rowIndex]



        