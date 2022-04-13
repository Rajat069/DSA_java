class Solution {
    public int firstUniqChar(String s) {
        String temp = "";
        for(int i=0;i<s.length();i++){
            if(!temp.contains(s.charAt(i)+"")){
            if(!s.substring(i+1).contains(s.charAt(i)+"")){
                return i;
            }
             temp+=s.charAt(i);   
            }
        }
        return -1;
    }
}