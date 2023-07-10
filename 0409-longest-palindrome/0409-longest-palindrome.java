class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char c:s.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int odd=0,evenC=0;
        for(Character c:hm.keySet()){
            if(hm.get(c)%2==0){
                evenC+=hm.get(c);
            }
            else {
                int oc=hm.get(c);
                odd+=oc-1;
            }
        }
        int sol=evenC+odd;
        return evenC==s.length()?sol:sol+1;
    }
}