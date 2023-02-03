class Solution {
    public String reverseWords(String s) {
        StringBuilder rev = new StringBuilder();
        int i = s.length() - 1, j = i;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') i--;
            j = i;
            while (j >= 0 && s.charAt(j) != ' ') j--;
            if (i >= 0) rev.append(s.substring(j + 1, i + 1) + " ");
            i = j;
        }
        return rev.toString().trim();
    }
}
