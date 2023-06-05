class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length())return false;
        int[] freq1 = new int[26],freq2 = new int[26];
        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++;
            freq2[s2.charAt(i)-'a']++;
        }
        for(int i=s1.length(),idx=0;i<s2.length();i++,idx++){
            boolean flag =true;
            for(int q=0;q<26;q++){
              if(freq1[q]!=freq2[q]){
                  flag=false;
                  break;
              }
             }
            if(flag)return true;
            freq2[s2.charAt(idx)-'a']--;
            freq2[s2.charAt(i)-'a']++;
        }
        return Arrays.equals(freq1,freq2);
    }
}