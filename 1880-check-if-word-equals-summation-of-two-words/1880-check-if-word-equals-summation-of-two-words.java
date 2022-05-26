class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String t) {
        return (countalph(firstWord)+countalph(secondWord))==countalph(t);
    }
    public int countalph(String s){
        if(s.length()==1)return s.charAt(0)-'a';
        int p = 0,p2 = s.length()-1;
        int ans = 0;
        while(p2!=-1){
            ans+=(s.charAt(p2--)-'a')*Math.pow(10,p++);
        }
        return ans;
    }
}