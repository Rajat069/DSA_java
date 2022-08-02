class Solution(object):
    def containsDuplicate(self, nums):
            nums.sort()
            i=0
            while(i<len(nums)):
                count=0
                if(i<len(nums)-1 and nums[i]==nums[i+1]):
                    return True
                i+=1
            return False