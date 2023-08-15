class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        if(s.length()==1)return wordDict.contains(s);
        boolean[] dp = new boolean[s.length()];
        HashSet<String>hs = new HashSet<>();
        for(String temp:wordDict){
            hs.add(temp);
        }
        for(int i=0;i<s.length();i++){
            for(int j=0;j<=i;j++){
                String sub = s.substring(j,i+1);
                if(hs.contains(sub)&&(j==0||dp[j-1])){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()-1];
    }
}