class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        for(int i=0;i<s.length();i++){
            HashSet<Character> hs = new HashSet<>();
            int p2=i;
            while(p2<s.length()&&!hs.contains(s.charAt(p2))){
                hs.add(s.charAt(p2++));
            }
            maxlen=Math.max(maxlen,p2-i);
          }
        return maxlen;
       }
   }
                  