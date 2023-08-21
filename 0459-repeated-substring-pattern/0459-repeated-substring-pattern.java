class Solution {
    public boolean repeatedSubstringPattern(String s) {
        for(int i=1;i<=(s.length()/2);i++){
            String temp = s.substring(0,i);
            if(temp.repeat(s.length()/temp.length()).equals(s))return true;
        }
        return false;
    }
}