class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int maxlen=0,mfreq=0;
        int[] freq = new int[26];
        for(int r=0;r<s.length();r++){
            freq[s.charAt(r)-'A']++;  //keep count of each char
            mfreq=Math.max(freq[s.charAt(r)-'A'],mfreq); //calculating maxfreq character
            if(r-l-mfreq+1>k){ //if length of string-most common character Eg. AAFG 4-2 = 2 is need to change 
                freq[s.charAt(l++)-'A']--; //incrementing l and decrementing freq of l moving widow AABB to ABBC sliding over it 
            }
            maxlen=Math.max(r-l+1,maxlen); //updating length
        }
        return maxlen;
    }
}