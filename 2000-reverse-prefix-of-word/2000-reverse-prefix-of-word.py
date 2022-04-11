class Solution(object):
    def reversePrefix(self, word, ch):
                idx = word.find(ch)
                if idx == -1:
                    return word
                idx2 = idx+1
                ans =""
                while(idx>-1):
                    ans+=word[idx]
                    idx-=1
                while(idx2<len(word)):
                    ans+=word[idx2]
                    idx2+=1
                return ans    
        