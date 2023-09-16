class Solution {
    public int countGoodSubstrings(String s) {
        if(s.length()<3)return 0;
        int count=0;
        HashMap<Character,Integer>hm = new HashMap<>();
        for(int i=0;i<3;i++){
           hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        count+=hm.size()==3?1:0;
        for(int i=3;i<s.length();i++){
            char delc=s.charAt(i-3);
            hm.put(delc,hm.get(delc)-1);
            if(hm.get(delc)==0)hm.remove(delc);
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
            if(hm.size()==3)count++;
        }
        return count;
    }
}