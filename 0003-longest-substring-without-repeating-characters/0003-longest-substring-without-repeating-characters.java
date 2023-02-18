class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        int p1=0,i=0;
        HashSet<Character> hs = new HashSet<>();
       while(i<s.length()){
            if(!hs.contains(s.charAt(i))){
                hs.add(s.charAt(i++));
                maxlen=Math.max(maxlen,hs.size());  
            }
            else{
                hs.remove(s.charAt(p1++));
            }
          }
        return maxlen;
       }
   }
                  