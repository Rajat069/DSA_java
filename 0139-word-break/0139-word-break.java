class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> dict = new HashSet<>(wordDict);
        boolean dp[] = new boolean[s.length()];
        return helper(0, s, dict, dp);
    }

    private boolean helper(int idx, String s, HashSet<String> dict, boolean[] dp) {
        if (idx == s.length()) {
            return true;
        }
        
        if (dp[idx]) {
            return false;
        }

        for (int i = idx + 1; i <= s.length(); i++) {
            if (dict.contains(s.substring(idx, i)) && helper(i, s, dict, dp)) {
                return true;
            }
        }
        dp[idx] = true; // Mark as visited
        return false;
    }
}
