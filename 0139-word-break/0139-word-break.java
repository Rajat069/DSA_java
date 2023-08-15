class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> dict = new HashSet<>(wordDict);
        boolean dp[] = new boolean[s.length() + 1];
        dp[0] = true; // Empty string is always breakable
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && dict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break; // Break the inner loop if word is found
                }
            }
        }

        return dp[s.length()];
    }
}