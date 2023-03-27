class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        if(p.length()>s.length())return new ArrayList<>();
        int[] freqp = new int[26];
        for(int i=0;i<p.length();i++){
            freqp[p.charAt(i)-'a']++;
        }
        ArrayList<Integer> ans_ar = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s.substring(0,p.length()));
        for(int i=p.length()-1,idx=0;i<s.length()&&idx<=s.length()-p.length();i++,idx++){
            if(i!=p.length()-1){
                sb.deleteCharAt(0);
                sb.append(s.charAt(i));
            }
            if(areAnagram(sb.toString(),freqp)){
                ans_ar.add(i-sb.length()+1);
            }
        }
        return ans_ar;
    }
    public static boolean areAnagram(String s,int[]freqp){
        int[] freq1 = new int[26];
        for(int i=0;i<s.length();i++){
            freq1[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freqp[i]!=freq1[i])return false;
        }
        return true;
    }
}