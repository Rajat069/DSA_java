class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Character> hm = new HashMap<>();
        HashSet<Character> mapped= new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            char d=t.charAt(i);
            if(!hm.containsKey(c)){
                if(mapped.contains(d))return false;
                hm.put(c,d);
                mapped.add(d);
            }
            else{
                if(hm.get(c)!=d)return false;
            }
        }
        return true;
    }
}