class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        char[] s1_ar = s1.toCharArray();
        char[] s2_ar = s2.toCharArray();
        Arrays.sort(s1_ar);
        Arrays.sort(s2_ar);
        int idx=0;
        int len=s1.length();
        int break_1=0;
        int break_2=0;
        while(idx<len){
            if(s1_ar[idx]>=s2_ar[idx])break_1++;
            if(s1_ar[idx]<=s2_ar[idx])break_2++;
            idx++;
        }
        return break_1==len||break_2==len;
    }
}