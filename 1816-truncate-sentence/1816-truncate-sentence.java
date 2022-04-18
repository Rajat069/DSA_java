class Solution {
    public String truncateSentence(String s, int k) {
        String s1[] = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<k;i++){
            ans.append(s1[i]+" ");
        }
        return ans.toString().trim();
    }
}