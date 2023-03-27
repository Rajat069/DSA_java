class Solution {
    public int myAtoi(String s) {
        if(s==null)return 0;
        Long sol = 0l;
        int idx=0;
        while(idx<s.length()&&s.charAt(idx)==' '){
            idx++;
        }
        boolean isnegative=false;
        if(idx==s.length())return 0;
        if(s.charAt(idx)=='-'){
            isnegative=true;
            idx++;
        }
        else if(s.charAt(idx)=='+')idx++;
        StringBuilder sb = new StringBuilder();
        Boolean non_zero=false;
        while(idx<s.length()){
            int num = s.charAt(idx)-'0';
            if(num>0&&num<=9)non_zero=true;
            if(num>=0&&num<=9&&sb.length()<=12&&non_zero){
                sb.append(num);
            }
            else if(num!=0)break;
            idx++;
        }
        if(sb.length()==0)return 0;
        if(isnegative){
            sol=Long.parseLong(sb.toString());
            sol*=-1;
        }
        else sol=Long.parseLong(sb.toString());
        
        if(sol>2147483647)return 2147483647;
        else if(sol<-2147483648)return -2147483648;
        int ans =sol.intValue(); 
        return ans;
    }
}