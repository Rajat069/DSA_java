class Solution {
    public String reversePrefix(String word, char ch) {
        int f=word.indexOf(ch);
        int f1=f+1;
        if(f==-1)return word;
        String ans = "";
        while(f>-1){
            ans+=word.charAt(f);
            f--;
        }
        while(f1<word.length()){
            ans+=word.charAt(f1);
            f1++;
        }
        return ans;
    }
}