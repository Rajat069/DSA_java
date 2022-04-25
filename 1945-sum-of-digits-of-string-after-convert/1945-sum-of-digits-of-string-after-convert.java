class Solution {
    public int getLucky(String s, int k) {
        StringBuilder temp1 = new StringBuilder();
        for(int i=0;i<s.length();i++){
            temp1.append((s.charAt(i)-'a')+1);
        }
        return st(temp1.toString(),k);
    }
    public int st(String s,int i1){
        if(i1==0)return Integer.valueOf(s);
        int temp =0;
        for(int i=0;i<s.length();i++){
            temp+=s.charAt(i)-'0';
        }
        return st(String.valueOf(temp),i1-1);
    }
}