class Solution {
    public boolean isNumber(String s) {
        int signC = 0, dot = 0, e = 0, num = 0;
        int eLoc = Integer.MAX_VALUE;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '+' || c == '-') {
                if (i != 0 && Character.toUpperCase(s.charAt(i - 1)) != 'E')
                    return false;
                signC++;
                if (signC > 2 || (signC == 2 && eLoc != i - 1) || i == s.length() - 1)
                    return false;
            } else if (c == 'e' || c == 'E') {
                if (i == s.length() - 1 || i == 0 || eLoc < i || num == 0)
                    return false;
                e++;
                eLoc = i;
                if (e > 1 || s.charAt(i - 1) == '-')
                    return false;
            } else if (c == '.') {
                dot++;
                if (dot > 1 || eLoc < i || (i + 1 == s.length() && num == 0) || (i + 1 < s.length() && !Character.isDigit(s.charAt(i + 1)) && s.charAt(i + 1) != 'e' && s.charAt(i + 1) != 'E'))
                    return false;
            } else if (!Character.isDigit(c)) {
                return false;
            } else {
                num++;
            }
        }
        if (e > 0 && num == 0)
            return false;
        return true;
    }
}
