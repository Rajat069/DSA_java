class Solution {
    public String firstPalindrome(String[] words) {
        for(String s:words){
            if(isPal(s))return s;
        }
        return "";
    }
    public boolean isPal(String s){
        for(int i=0,j=s.length()-1;i<s.length()/2;i++,j--){
            if(s.charAt(i)!=s.charAt(j))return false;
        }
        return true;
    }
}