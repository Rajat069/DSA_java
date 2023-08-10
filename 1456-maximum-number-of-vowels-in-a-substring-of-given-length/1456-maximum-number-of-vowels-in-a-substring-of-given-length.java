class Solution {
    public int maxVowels(String s, int k) {
        HashSet<Character>hs = new HashSet<>(Arrays.asList('a','e','i','o','u'));
        int count=0;
        for(int i=0;i<k;i++){
            if(hs.contains(s.charAt(i))){
                count++;
            }
        }
        int maxC=count;
        for(int i=k,idx=0;i<s.length();i++,idx++){
            if(hs.contains(s.charAt(idx))){
                count--;
            }
            if(hs.contains(s.charAt(i))){
                count++;
            }
            maxC=Math.max(maxC,count);
        }
        return maxC;
    }
}