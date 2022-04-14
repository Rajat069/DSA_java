class Solution(object):
    def merge(self, nums1, m, nums2, n):
            p=m
            p1=0
            while(p<m+n and p1<n):
                nums1[p]=nums2[p1]
                p+=1
                p1+=1
            nums1.sort()    
        