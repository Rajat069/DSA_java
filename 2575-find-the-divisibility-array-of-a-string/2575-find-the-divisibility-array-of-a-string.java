class Solution {
    public int[] divisibilityArray(String word, int m) {
        int[] ar = new int[word.length()];
        long rem=0;
        for(int i=0;i<word.length();i++){
            rem=(rem*10+(word.charAt(i)-'0'))%m;
            if(rem%m==0)ar[i]=1;
            else ar[i]=0;
        }
        return ar;
    }
}