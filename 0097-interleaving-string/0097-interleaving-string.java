class Solution {
    int len1,len2,len3;
    HashMap<String,Boolean>hm = new HashMap<>();
    public boolean isInterleave(String s1, String s2, String s3) {
         this.len1=s1.length();
         this.len2=s2.length();
         this.len3=s3.length();
         if(len1+len2!=len3)return false;
         return helper(s1,s2,s3,0,0,0);
    }
    private boolean helper(String s1,String s2,String s3,int p1,int p2,int p3){
        if(p3==len3){
            return p1==len1&&p2==len2;
        }
        String key=p1+"-"+p2+"-"+p3;
        if(hm.containsKey(key)){
            return hm.get(key);
        }
        if(p1==len1){
        boolean result = s2.charAt(p2)==s3.charAt(p3) ? helper(s1,s2,s3,p1,p2+1,p3+1) : false;
        hm.put(key, result); 
        return result;
        }
        if(p2==len2){
        boolean result = s1.charAt(p1)==s3.charAt(p3) ? helper(s1,s2,s3,p1+1,p2,p3+1) : false; 
        hm.put(key, result);
        return result;
        }
        boolean one = false,two=false;
        if(s1.charAt(p1)==s3.charAt(p3)){
            one=helper(s1,s2,s3,p1+1,p2,p3+1);
        }
        if(s2.charAt(p2)==s3.charAt(p3)){
            two=helper(s1,s2,s3,p1,p2+1,p3+1);
        }
        boolean res=one||two;
        hm.put(key,res);
        return res;
    }
}