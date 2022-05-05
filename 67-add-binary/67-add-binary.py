class Solution(object):
    def addBinary(self, a, b): 
            return bin(int(int(a,2)+int(b,2))).replace("0b", "")       
        