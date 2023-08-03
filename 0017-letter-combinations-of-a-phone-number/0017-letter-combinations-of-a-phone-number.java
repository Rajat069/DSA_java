class Solution {
    List<String> sol = new ArrayList<>(); // A list to store the final letter combinations.

    // Main function to generate letter combinations for a given digit string.
    public List<String> letterCombinations(String digits) {
        // Call the helper function with initial parameters.
        helper(digits, new StringBuilder(), 0);

        // Return the final list of letter combinations.
        return sol;
    }

    // Mapping of digits to their respective letters.
    String[] mp = new String[]{
        "",
        "abc",
        "def",
        "ghi",
        "jkl",
        "mno",
        "pqrs",
        "tuv",
        "wxyz"
    };

    // Recursive helper function to generate letter combinations.
    private void helper(String dig, StringBuilder sb, int idx) {
        // If the index reaches the end of the digit string, add the generated combination to the result list.
        if (idx == dig.length()) {
            if (sb.length() != 0) // Avoid adding empty strings to the list.
                sol.add(sb.toString());
            return;
        }

        // Get the current digit and find its corresponding letters.
        int d = dig.charAt(idx) - '0';
        String mapping = mp[d - 1];

        // Iterate through the letters of the current digit and form combinations recursively.
        for (int i = 0; i < mapping.length(); i++) {
            sb.append(mapping.charAt(i)); // Add the current letter to the temporary combination.
            helper(dig, sb, idx + 1); // Generate combinations for the next digit.
            sb.deleteCharAt(sb.length() - 1); // Backtrack and remove the last letter for next iterations.
        }
    }
}
