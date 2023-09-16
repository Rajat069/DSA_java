class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        String og = String.valueOf(x);
        StringBuilder sb = new StringBuilder(og);
        sb.reverse();
        return sb.toString().equals(og);
    }
}