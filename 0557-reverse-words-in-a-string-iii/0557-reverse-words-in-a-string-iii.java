class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        String[] ar = s.split(" ");
        for(String s1:ar){
            StringBuilder rev= new StringBuilder(s1);
            rev.reverse();
            ans.append(rev.toString()+" ");   
        }
        return ans.toString().trim();
    }
}