class Solution {
    public String countAndSay(int n) {
       return helper(1,n,"1");
    }
    private String helper(int cur,int n,String s){
        if(cur>=n){
            return s;
        }
        int idx=0;
        StringBuilder sb = new StringBuilder();
        while(idx<s.length()){
            char num = s.charAt(idx);
            int count=0;
            while(idx<s.length()&&num==s.charAt(idx)){
                idx++;
                count++;
            }
            sb.append(count+""+num);
        }
        String nextS=sb.toString();
        return helper(cur+1,n,nextS);
    }
}