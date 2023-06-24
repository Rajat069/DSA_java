class Solution {
    public int compress(char[] chars) {
        if (chars.length == 1)
            return 1;

        int i = 0;
        for (int idx = 0; idx < chars.length; idx++) {
            int count = 0;
            char ch = chars[idx];
            while (idx < chars.length && chars[idx] == ch) {
                count++;
                idx++;
            }
            idx--;

            if (count == 1) {
                chars[i] = ch;
                i++;
                continue;
            }

            chars[i] = ch;
            i++;

            if (count > 9) {
                String val = String.valueOf(count);
                int lc = 0;
                while (lc < val.length()) {
                    chars[i] = val.charAt(lc);
                    i++;
                    lc++;
                }
            } else {
                chars[i] = (char) (count + '0');
                i++;
            }
        }

        return i;
    }
}
