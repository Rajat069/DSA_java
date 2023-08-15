class Solution {
    public String mergeAlternately(String word1, String word2) {
        int p1=0,p2=0,idx=0;
        StringBuilder sb = new StringBuilder();
        while(p1<word1.length()&&p2<word2.length()){
             if(idx%2==0){
                 sb.append(word1.charAt(p1++));
             }
            else{
                sb.append(word2.charAt(p2++));
            }
            idx++;
        }
        if(p1<word1.length())sb.append(word1.substring(p1));
        if(p2<word2.length())sb.append(word2.substring(p2));
        return sb.toString();
    }
}