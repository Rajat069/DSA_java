class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int maxlen=0,mfreq=0;
        int[] freq = new int[26];
        for(int r=0;r<s.length();r++){
            freq[s.charAt(r)-'A']++;
            mfreq=Math.max(freq[s.charAt(r)-'A'],mfreq);
            if(r-l-mfreq+1>k){
                freq[s.charAt(l++)-'A']--;
            }
            maxlen=Math.max(r-l+1,maxlen);
        }
        return maxlen;
    }
}