class Solution {
    public boolean validPalindrome(String s) {
        int f = 0;
        int l = s.length()-1;
        while(f<l){
            if(s.charAt(f)==s.charAt(l)){
                f++;
                l--;
            }
            else
            {
                return helper(s,f+1,l)||helper(s,f,l-1);
            }
        }
        return true;
        
    }
    public boolean helper(String s,int f,int l){
        while(f<l){
             if(s.charAt(f)==s.charAt(l)){
                f++;
                l--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
}