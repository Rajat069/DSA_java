class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(str1.length()>str2.length())return GCD(str1,str2);
        return GCD(str2,str1);
    }
    public String GCD(String one,String two){
        for(int i=two.length();i>0;i--){
            String sub = two.substring(0,i);
            if(isMul(one,sub)&&isMul(two,sub))return sub;
        }
        return "";
    }
    public boolean isMul(String s, String t) {
       if (s.length() % t.length() != 0) {
         return false;
      }
      StringBuilder sb = new StringBuilder();
      int repetitions = s.length() / t.length();
      for (int i = 0; i < repetitions; i++) {
        sb.append(t);
      }
     return sb.toString().equals(s);
  }

}