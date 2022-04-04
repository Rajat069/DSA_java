class Solution {
    public int prefixCount(String[] words, String pref) {
        int ans=0;
        for(String st:words){
             int comp =0;
             int loop =0;
             for(int i=0;i<pref.length()&&i<st.length();i++){
                   if(st.charAt(i)!=pref.charAt(i)){
                        comp++;
                        break;
                  }
                 loop++;
             }     
            if(comp==0&&loop==pref.length())ans++;
        }
        return ans;
    }
}