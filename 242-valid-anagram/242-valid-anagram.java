class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        int s1[] = new int[s.length()];
        int s2[] = new int[t.length()];
        for(int i=0;i<s.length();i++){
            s1[i]=s.charAt(i)-'a';
        }
        for(int i=0;i<t.length();i++){
            s2[i]=t.charAt(i)-'a';
        }
        Arrays.sort(s1);
        Arrays.sort(s2);
        for(int i=0;i<s.length();i++){
            if(s1[i]!=s2[i])return false;
        }
        return true;
    }
}