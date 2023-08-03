class Solution {
    List<String> sol = new ArrayList<>(); 
    public List<String> generateParenthesis(int n) {
        helper(n, new StringBuilder(), 0, 0); 
        return sol; 
    }
    // Recursive helper function to generate balanced parentheses combinations.
    private void helper(int n, StringBuilder sb, int open, int close) {
        if (sb.length() == n * 2) {
            sol.add(sb.toString());
            return;
        }
        // If there are still unclosed opening parentheses left to add (less than 'n'),
        // add an opening parenthesis and make a recursive call.
        if (open < n) {
            sb.append("(");
            helper(n, sb, open + 1, close); // Recursive call with increased count of open parentheses.
            sb.deleteCharAt(sb.length() - 1); // Backtrack and remove the last added parenthesis.
        }
        // If there are more open parentheses than close parentheses, we can add a closing parenthesis
        // to form a balanced pair and make a recursive call.
        if (close < open) {
            sb.append(")");
            helper(n, sb, open, close + 1); // Recursive call with increased count of close parentheses.
            sb.deleteCharAt(sb.length() - 1); // Backtrack and remove the last added parenthesis.
        }
    }
}
