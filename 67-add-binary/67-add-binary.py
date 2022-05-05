class Solution(object):
    def addBinary(self, a, b): 
            summ= int(int(a,2)+int(b,2))
            return bin(summ).replace("0b", "")       
        