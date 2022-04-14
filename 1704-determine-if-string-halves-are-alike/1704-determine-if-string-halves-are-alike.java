class Solution {
    public boolean halvesAreAlike(String s) {
        int f,l;
        f=l=0;
        String vowel = "aeiouAEIOU";
        int p1=s.length()/2-1;
        int p2=s.length()/2;
        while(p1>-1&&p2<s.length()){
            if(vowel.contains(s.charAt(p1)+"")){
                f++;
            }
            if(vowel.contains(s.charAt(p2)+"")){
                l++;
            }
            p1--;
            p2++;
        }
        return f==l;
    }
}