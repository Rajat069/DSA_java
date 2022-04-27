class Solution(object):
    def rearrangeArray(self, nums):
            list1 = [0 for i in range(len(nums))]
            p1=0
            p2=0
            for i in range(len(nums)):
                if i%2==0:
                    while(i<len(nums)and nums[p1]<0):
                           p1+=1
                    list1[i]=nums[p1]
                    p1+=1
                else:
                    while(i<len(nums) and nums[p2]>0):
                              p2+=1
                    list1[i]=nums[p2]
                    p2+=1        
            return list1               
                    
        