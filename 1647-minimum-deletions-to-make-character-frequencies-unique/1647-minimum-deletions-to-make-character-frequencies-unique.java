class Solution {
    public int minDeletions(String s) {
        int[]freq = new int[26];
        for(char c:s.toCharArray()){
            freq[c-'a']++;
        }
        HashSet<Integer>hs = new HashSet<>();
        int minDel=0;
        for(int v:freq){
            int vv=v;
            while(vv>0&&hs.contains(vv)){
                vv--;
                minDel++;
            }
            hs.add(vv);
        }
        return minDel;
    }
}