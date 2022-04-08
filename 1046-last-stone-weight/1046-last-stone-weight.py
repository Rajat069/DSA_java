class Solution(object):
    def lastStoneWeight(self, stones):
            stones.sort()
            for i in range(len(stones)-2,-1,-1): 
                stones.sort()
                stones[i]=abs(stones[i+1]-stones[i])
            return stones[0]    
        