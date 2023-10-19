import java.util.HashSet;

class Solution {
    String sol = "";
    HashSet<String> hs = new HashSet<>();

    public String findDifferentBinaryString(String[] nums) {
        int len = nums[0].length();
        for (String s : nums) {
            hs.add(s);
        }
        generateCombinations(new StringBuilder(), len);
        return sol;
    }

    private void generateCombinations(StringBuilder current, int n) {
        if (n == 0) {
            if (!hs.contains(current.toString())) {
                sol = current.toString();
            }
        } else {
        generateCombinations(new StringBuilder(current).append("0"),n- 1);
        generateCombinations(new StringBuilder(current).append("1"),n- 1);
        }
    }
}
