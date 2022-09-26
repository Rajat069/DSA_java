class Solution {
    public String reverseStr(String s, int k) {
     StringBuilder sb = new StringBuilder(s);
        int j=0;
        int len = (int)Math.ceil((float)s.length()/(2*k));
        for(int i=0;i<len;i++){
            StringBuilder temp = new StringBuilder(i==len-1?s.length()-j<k?s.substring(j):s.substring(j,j+k):s.substring(j,j+k));
            temp.reverse();
            if(i==len-1&&(s.length()-j)<k){
                sb.replace(j,s.length(),temp.toString());
            }
            else sb.replace(j,j+k,temp.toString());
            j+=2*k;
        }
        return sb.toString();
    }
}