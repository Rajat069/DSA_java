class Solution {
    public int minFlipsMonoIncr(String s) {
       int flip=0;
       int one_count=0; 
       for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='1'){
               one_count++;
           } 
           if(one_count>0&&s.charAt(i)=='0'){
               flip++;
           }
           flip=Math.min(one_count,flip);
       }
       return flip;
    }
}